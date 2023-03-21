package com.chen.excel.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.chen.excel.listener.EntityColDataListener;
import com.chen.excel.listener.EntityDataListener;
import com.chen.excel.model.EntityColData;
import com.chen.excel.model.EntityData;
import com.chen.excel.util.TestFileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LeifChen
 */
@Service
@Slf4j
public class ExcelService {

    public void simpleRead() {
        String fileName = TestFileUtil.getPath() + "demo" + File.separator + "demo.xlsx";
        try (ExcelReader excelReader = EasyExcel.read(fileName).build()) {
            List<ReadSheet> sheets = excelReader.excelExecutor().sheetList();
            log.info("sheet总数：{}", sheets.size());
            // 1.处理第1个sheet
            ReadSheet readSheet0 = EasyExcel.readSheet(0).head(EntityData.class).registerReadListener(new EntityDataListener()).build();

            // 2.处理剩余sheet
            List<ReadSheet> allSheets = new ArrayList<>();
            allSheets.add(readSheet0);
            for (int i = 1; i < sheets.size(); i++) {
                log.info("sheet编号：{}，sheet名称：{}", sheets.get(i).getSheetNo(), sheets.get(i).getSheetName());
                ReadSheet readSheet = EasyExcel.readSheet(i).head(EntityColData.class).registerReadListener(new EntityColDataListener()).build();
                allSheets.add(readSheet);
            }
            excelReader.read(allSheets);
        }
    }
}

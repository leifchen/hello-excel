package com.chen.excel.controller;

import com.chen.excel.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LeifChen
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ExcelService excelService;

    @GetMapping("/readExcel")
    public void readExcel() {
        excelService.simpleRead();
    }
}

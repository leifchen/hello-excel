package com.chen.excel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author LeifChen
 */
@Getter
@Setter
@EqualsAndHashCode
public class EntityData {
    @ExcelProperty("表英文名")
    private String tableName;
    @ExcelProperty("业务口径")
    private String tableDesc;
    @ExcelProperty("层级")
    private String className;
    @ExcelProperty("主题域")
    private String pathName;
    @ExcelProperty("更新周期")
    private String dataCycle;
}
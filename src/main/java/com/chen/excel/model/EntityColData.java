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
public class EntityColData {
    @ExcelProperty("序号")
    private String orderNo;
    @ExcelProperty("字段属性")
    private String colName;
    @ExcelProperty("字段名称")
    private String colComment;
    @ExcelProperty("字段描述")
    private String colDesc;
    @ExcelProperty("数据类型")
    private String dataType;
    @ExcelProperty("是否权限字段")
    private String isDataAuth;
    @ExcelProperty("安全等级")
    private String securityLevel;
    @ExcelProperty("字段长度")
    private String colLength;
    @ExcelProperty("字段精度")
    private String colPrecision;
    @ExcelProperty("是否分区字段")
    private String isPartition;
}
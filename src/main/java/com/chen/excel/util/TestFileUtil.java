package com.chen.excel.util;

import java.io.File;
import java.io.InputStream;

/**
 * @author LeifChen
 */
public class TestFileUtil {

    private TestFileUtil() {
    }

    public static String getPath() {
        return TestFileUtil.class.getResource("/").getPath();
    }
}

package com.xiaoleilu.hutool.core.util;

import com.xiaoleilu.hutool.lang.Console;
import com.xiaoleilu.hutool.util.ZipUtil;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;

/**
 * {@link ZipUtil}单元测试
 *
 * @author Looly
 */
public class ZipUtilTest {

    @Test
    @Ignore
    public void unzipTest() {
        File unzip = ZipUtil.unzip("E:\\aaa\\RongGenetor V1.0.0.zip", "e:\\aaa");
        Console.log(unzip);
        File unzip2 = ZipUtil.unzip("E:\\aaa\\RongGenetor V1.0.0.zip", "e:\\aaa");
        Console.log(unzip2);
    }
}

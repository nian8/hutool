package com.xiaoleilu.hutool.core.io;

import com.xiaoleilu.hutool.io.file.FileCopier;
import org.junit.Ignore;
import org.junit.Test;

/**
 * 文件拷贝单元测试
 *
 * @author Looly
 */
public class FileCopierTest {

    @Test
    @Ignore
    public void dirCopyTest() {
        FileCopier copier = FileCopier.create("D:\\Java", "e:/eclipse/eclipse2.zip");
        copier.copy();
    }
}

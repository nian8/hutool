package com.xiaoleilu.hutool.core.util;

import com.xiaoleilu.hutool.io.FileUtil;
import com.xiaoleilu.hutool.util.ImageUtil;
import org.junit.Test;

import java.awt.*;

public class ImageUtilTest {

    @Test
    public void scaleTest() {
        ImageUtil.scale(FileUtil.file("e:/face.jpg"), FileUtil.file("e:/face_result.jpg"), 0.5f);
    }

    @Test
    public void scaleByWidthAndHeightTest() {
        ImageUtil.scale(FileUtil.file("e:/face.jpg"), FileUtil.file("e:/face_result.jpg"), 100, 800, Color.BLUE);
    }

    @Test
    public void cutTest() {
        ImageUtil.cut(FileUtil.file("e:/face.jpg"), FileUtil.file("e:/face_result.jpg"), new Rectangle(200, 200, 100, 100));
    }
}

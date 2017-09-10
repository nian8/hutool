package com.xiaoleilu.hutool.core.lang;

import com.xiaoleilu.hutool.lang.BCD;
import org.junit.Assert;
import org.junit.Test;

public class BCDTest {

    @Test
    public void bcdTest() {
        String strForTest = "123456ABCDEF";

        //转BCD
        byte[] bcd = BCD.strToBcd(strForTest);
        String str = BCD.bcdToStr(bcd);
        //解码BCD
        Assert.assertEquals(strForTest, str);
    }
}

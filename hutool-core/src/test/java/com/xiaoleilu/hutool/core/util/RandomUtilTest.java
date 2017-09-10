package com.xiaoleilu.hutool.core.util;

import com.xiaoleilu.hutool.util.CollectionUtil;
import com.xiaoleilu.hutool.util.RandomUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class RandomUtilTest {
    @Test
    public void randomEleSetTest() {
        Set<Integer> set = RandomUtil.randomEleSet(CollectionUtil.newArrayList(1, 2, 3, 4, 5, 6), 2);
        Assert.assertEquals(set.size(), 2);
    }
}

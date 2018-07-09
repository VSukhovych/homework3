package com.epam.lab.homework3.unit;

import com.epam.lab.homework3.Lock;
import org.junit.Assert;
import org.junit.Test;

public class TestLockTask1 {
    @Test
    public void testLock() {
        Lock lock = new Lock(10);
        Assert.assertEquals(true, lock.isLocked());
        Assert.assertTrue(lock.unlock(10));
        Assert.assertFalse(lock.isLocked());
        lock.lock();
        Assert.assertNotEquals(false, lock.isLocked());
        Assert.assertEquals(false, lock.unlock(1));
        Assert.assertEquals(true, lock.isLocked());
    }
}

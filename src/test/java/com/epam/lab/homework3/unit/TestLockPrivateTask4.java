package com.epam.lab.homework3.unit;

import com.epam.lab.homework3.LockPrivate;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestLockPrivateTask4 {
    @Test
    public void testLock() {
        LockPrivate lockPrivate = new LockPrivate(10);
        Class<?> classOb = lockPrivate.getClass();
        try {
            Method currentMethod = classOb.getDeclaredMethod("isLocked");
            currentMethod.setAccessible(true);
            Assert.assertEquals(true, currentMethod.invoke(lockPrivate));
        } catch (NoSuchMethodException e) {
            System.out.print("Method not found");
        } catch (IllegalAccessException e) {
            System.out.print("Illegal access");
        } catch (InvocationTargetException e) {
            System.out.print("Invocation target");
        }
    }
}

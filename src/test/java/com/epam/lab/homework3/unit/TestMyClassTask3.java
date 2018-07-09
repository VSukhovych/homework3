package com.epam.lab.homework3.unit;

import com.epam.lab.homework3.MyClass;
import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import static junit.framework.TestCase.fail;

public class TestMyClassTask3 {
    private static Logger errorLog = Logger.getLogger("ErrorLogger");
    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            errorLog.debug(description.toString(), e);
            super.failed(e, description);
        }
    };

    @Test
    public void testKey() {
        MyClass myClass = new MyClass();
        myClass.setId(2);
        myClass.setSecret(10);
        if (myClass.calculateKey().intValue() != 10) {
            fail("Fail in testKey()");
        }
    }
}

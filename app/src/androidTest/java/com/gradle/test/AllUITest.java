package com.gradle.test;

import android.app.Activity;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by ipropertymobile on 7/14/14.
 */
public class AllUITest extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(TestSuite.createTest(UITest.class, "testUI"));

        return suite;
    }
}

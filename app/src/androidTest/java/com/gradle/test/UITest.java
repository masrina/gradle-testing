package com.gradle.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import com.ipropertymobile.gradletestingtest.MyActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ipropertymobile on 7/14/14.
 */
public class UITest extends ActivityInstrumentationTestCase2<MyActivity>{
    public UITest() {
        super(MyActivity.class);
    }
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }
    @LargeTest
    public void testUI() throws InterruptedException {
        onView(withText("Hello world!")).check(matches(isDisplayed()));
        Thread.sleep(2000);
    }
    public void tearDown(){
        getActivity().finish();
    }
}

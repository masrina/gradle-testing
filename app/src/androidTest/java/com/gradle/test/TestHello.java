package com.gradle.test;

import android.os.Bundle;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.text.TextUtils;

import com.ipropertymobile.gradletestingtest.MyActivity;
import com.ipropertymobile.gradletestingtest.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ipropertymobile on 7/14/14.
 */
public class TestHello extends ActivityInstrumentationTestCase2<MyActivity> {
    public TestHello(){
        super(MyActivity.class);
    }
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }
    @LargeTest
    public void testHello() throws InterruptedException {
        onView(withId(R.id.button)).check(matches(isDisplayed()));
        onView(withId(R.id.button)).perform(click());
        Thread.sleep(2000);
    }
    public void tearDown(){
        getActivity().finish();
    }
}
package com.example.smar.passwordvalidator;

/**
 * Created by SMAR on 2/10/2018.
 */

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class EspTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void test1() {
        onView(withId(R.id.enterPass))
                .perform(typeText("asfD&1dfg"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.strength))
                .check(matches(withText("Invalid Password")));
    }

    @Test
    public void test2() {
        onView(withId(R.id.enterPass))
                .perform(typeText("aadfsdagfdfg"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.strength))
                .check(matches(withText("Invalid Password")));
    }

    @Test
    public void test3() {
        onView(withId(R.id.enterPass))
                .perform(typeText("dasd$sdfd"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.strength))
                .check(matches(withText("Invalid Password")));
    }

    @Test
    public void test4() {
        onView(withId(R.id.enterPass))
                .perform(typeText("sadf"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.strength))
                .check(matches(withText("Invalid Password")));
    }

    @Test
    public void test5() {
        onView(withId(R.id.enterPass))
                .perform(typeText("password"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.strength))
                .check(matches(withText("Invalid Password")));
    }

    @Test
    public void test6() {
        onView(withId(R.id.enterPass))
                .perform(typeText("afdsaf432"), closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.strength))
                .check(matches(withText("Invalid Password")));
    }



}
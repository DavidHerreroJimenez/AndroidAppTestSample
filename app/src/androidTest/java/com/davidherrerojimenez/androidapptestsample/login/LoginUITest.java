package com.davidherrerojimenez.androidapptestsample.login;

import android.support.test.espresso.matcher.ViewMatchers;import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import com.davidherrerojimenez.androidapptestsample.R;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Proyect: EspressoExample.
 * Package name: com.davidherrerojimenez.espressosample.
 * Created by udhj1a on 23/08/2017 12:52.
 */

@RunWith(AndroidJUnit4.class)
public class LoginUITest {

    String fakeEmailOK, fakePasswordOK, fakeEmailFail, fakePasswordFail;


    @Rule
    public ActivityTestRule<LoginActivity> loginActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Before
    public void setFakeValues() throws  Exception{

        fakeEmailOK = "david@gmail.com";
        fakePasswordOK = "123456";
        fakeEmailFail = "lelele";
        fakePasswordFail = "1";

    }


    @Test
    public void testSignButton() throws  Exception{
        onView(withId(R.id.signin)).perform(click());
    }

    @Test
    public void testEmptyEmailWhenPressSignInButton() throws  Exception{

        onView(withId(R.id.input_password)).perform(typeText(fakePasswordOK), closeSoftKeyboard());
        onView(withId(R.id.signin)).perform(click());

        onView(withText(R.string.accept_alert)).check(matches(isDisplayed()));

    }

    @Test
    public void testEmptyPasswordWhenPressSingInButton() throws  Exception{

        onView(withId(R.id.input_email)).perform(typeText(fakeEmailOK), closeSoftKeyboard());

        onView(withId(R.id.signin)).perform(click());

        onView(withText(R.string.accept_alert)).check(matches(isDisplayed()));
    }


}

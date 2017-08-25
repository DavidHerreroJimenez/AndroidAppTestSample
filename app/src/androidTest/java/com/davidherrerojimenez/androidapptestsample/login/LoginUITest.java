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

    @Rule
    public ActivityTestRule<LoginActivity> loginActivityTestRule = new ActivityTestRule<LoginActivity>(LoginActivity.class);

    @Test
    public void checkIfInPutEmailEditTextFound(){
        onView(ViewMatchers.withId(R.id.input_email)).perform(typeText("david@gmail.com"), closeSoftKeyboard(), clearText(), typeText("adios"), closeSoftKeyboard());
    }

    @Test
    public void checkIfInputPasswordEditTextFund(){
        onView(withId(R.id.input_password)).perform(typeText("123456"), closeSoftKeyboard(), clearText(), typeText("1234"), closeSoftKeyboard());
    }

    @Test
    public void checkSignButton(){
        onView(withId(R.id.signin)).perform(click());
    }

    @Test
    public void checkEmptyEmailWhenPressSignInButton(){
        onView(withId(R.id.input_email)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.input_password)).perform(typeText("1234567"), closeSoftKeyboard());
        onView(withId(R.id.signin)).perform(click());

        onView(withText(R.string.accept_alert)).check(matches(isDisplayed()));

    }
}

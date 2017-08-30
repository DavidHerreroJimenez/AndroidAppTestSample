package com.davidherrerojimenez.androidapptestsample.home;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.Espresso.openContextualActionModeOverflowMenu;

/**
 * Proyect: AndroidAppTestSample.
 * Package name: com.davidherrerojimenez.androidapptestsample.home.
 * Created by udhj1a on 30/08/2017 12:51.
 */

@RunWith(AndroidJUnit4.class)
public class HomeUITest {

    @Rule
    public ActivityTestRule<HomeActivity> homeActivityTestRule = new ActivityTestRule<HomeActivity>(HomeActivity.class);



    @Test
    public void testContextualActionModeOverFlowMenu() {
        openContextualActionModeOverflowMenu();
    }

    @Test
    public void testOVerflowOptionsMenu(){
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.getInstrumentation().getTargetContext());
    }
}

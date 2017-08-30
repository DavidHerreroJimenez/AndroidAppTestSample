package com.davidherrerojimenez.androidapptestsample;

import com.davidherrerojimenez.androidapptestsample.home.HomeUITest;
import com.davidherrerojimenez.androidapptestsample.login.LoginUITest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Proyect: AndroidAppTestSample.
 * Package name: com.davidherrerojimenez.androidapptestsample.
 * Created by udhj1a on 30/08/2017 14:35.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({LoginUITest.class,HomeUITest.class})
public class GlobalUITest {
}

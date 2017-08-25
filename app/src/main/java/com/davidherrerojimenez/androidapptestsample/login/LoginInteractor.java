package com.davidherrerojimenez.androidapptestsample.login;

/**
 * Proyect: EspressoExample.
 * Package name: com.davidherrerojimenez.androidapptestsample.login.
 * Created by udhj1a on 23/08/2017 15:25.
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener{
        void onEmailError();
        void onPasswordError();
        void onSucces();
    }

    void login(String email, String password, OnLoginFinishedListener loginFinishedListener);
}

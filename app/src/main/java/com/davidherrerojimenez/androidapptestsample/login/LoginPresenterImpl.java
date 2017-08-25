package com.davidherrerojimenez.androidapptestsample.login;

/**
 * Proyect: EspressoExample.
 * Package name: com.davidherrerojimenez.androidapptestsample.login.
 * Created by udhj1a on 23/08/2017 15:23.
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;


    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validateUser(String email, String password) {

        loginInteractor.login(email, password, this);
    }

    @Override
    public void onEmailError() {

        if(loginView != null){
            loginView.setEmailError();
        }
    }

    @Override
    public void onPasswordError() {

        if(loginView != null){
            loginView.setPasswordError();
        }
    }

    @Override
    public void onSucces() {

        if(loginView != null){
            loginView.goHome();
        }
    }
}

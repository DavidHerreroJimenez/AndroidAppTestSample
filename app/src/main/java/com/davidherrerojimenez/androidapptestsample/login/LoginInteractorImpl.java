package com.davidherrerojimenez.androidapptestsample.login;


/**
 * Proyect: EspressoExample.
 * Package name: com.davidherrerojimenez.androidapptestsample.login.
 * Created by udhj1a on 23/08/2017 15:28.
 */

public class LoginInteractorImpl implements  LoginInteractor {

    @Override
    public void login(String email, String password, OnLoginFinishedListener loginFinishedListener) {

        if(callOnEmailErrorIfCheckFailed(email, loginFinishedListener) && callOnPasswordErrorIFCheckFailed(password, loginFinishedListener)){

            loginFinishedListener.onSucces();
        }
    }


    public boolean callOnEmailErrorIfCheckFailed(String email, OnLoginFinishedListener loginFinishedListener){

        if (!checkEmail(email)){
            loginFinishedListener.onEmailError();
            return false;
        }else{
            return true;
        }
    }

    public boolean callOnPasswordErrorIFCheckFailed(String password, OnLoginFinishedListener loginFinishedListener){
        if(!checkPassword(password)){
            loginFinishedListener.onPasswordError();
            return false;
        }else{
            return true;
        }
    }


    public boolean checkEmail(String email){

        if(email != null && !email.isEmpty() && email.trim().contains("@") && email.trim().length()> 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkPassword(String password){

        if(password != null && !password.isEmpty() && password.trim().length()> 1 && password.trim().length()<= 8){
            return true;
        }else{
            return false;
        }
    }
}

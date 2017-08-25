package com.davidherrerojimenez.androidapptestsample.login;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Proyect: EspressoExample.
 * Package name: com.davidherrerojimenez.androidapptestsample.login.
 * Created by udhj1a on 24/08/2017 15:30.
 */
public class LoginInteractorImplTest {

    String fakeEmailOk, fakePasswordOk, fakeEmailKo, fakePasswordKo;

    LoginInteractorImpl loginInteractorImpl;

    LoginInteractor loginInteractor;

    LoginInteractor.OnLoginFinishedListener onLoginFinishedListener;

    @Before
    public void setUp() throws Exception {
        fakeEmailOk = "david@gmail.com";
        fakePasswordOk = "1234567";

        fakeEmailKo = "lala";
        fakePasswordKo = "123456789";

        loginInteractorImpl = new LoginInteractorImpl();

        loginInteractor = new LoginInteractorImpl();

        onLoginFinishedListener = Mockito.mock(LoginInteractor.OnLoginFinishedListener.class);

    }

//    TODO falta averiguar como podemos hacer test de un metodo al que se le pasa un listener
    @Test
    public void loginWithCorrectEmailAndPass() throws Exception {

        loginInteractorImpl.login(fakeEmailOk, fakePasswordOk, onLoginFinishedListener);

    }

    @Test
    public void callOnEmailErrorIfCheckFailed() throws Exception {

        assertTrue(loginInteractorImpl.callOnEmailErrorIfCheckFailed(fakeEmailOk, onLoginFinishedListener));

    }

    @Test
    public void callOnEmailErrorIfCheckFailedWhenEmailIsIncorrect() throws Exception {

        assertFalse(loginInteractorImpl.callOnEmailErrorIfCheckFailed(fakeEmailKo, onLoginFinishedListener));

    }


    @Test
    public void callOnPasswordErrorIFCheckFailed() throws Exception {
        assertTrue(loginInteractorImpl.callOnPasswordErrorIFCheckFailed(fakePasswordOk, onLoginFinishedListener));
    }

    @Test
    public void callOnPasswordErrorIFCheckFailedWhenPasswordIsIncorrect() throws Exception {
        assertFalse(loginInteractorImpl.callOnPasswordErrorIFCheckFailed(fakePasswordKo, onLoginFinishedListener));
    }

    @Test
    public void checkEmailOk() throws Exception {

        assertTrue(loginInteractorImpl.checkEmail(fakeEmailOk));

    }

    @Test
    public void checkEmailKo() throws Exception {

        assertFalse(loginInteractorImpl.checkEmail(fakeEmailKo));

    }

    @Test
    public void checkPasswordOk() throws Exception {

        assertTrue(loginInteractorImpl.checkPassword(fakePasswordOk));

    }

    @Test
    public void checkPasswordKo() throws Exception {

        assertFalse(loginInteractorImpl.checkPassword(fakePasswordKo));

    }

}
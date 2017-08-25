package com.davidherrerojimenez.androidapptestsample.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;

import com.davidherrerojimenez.androidapptestsample.R;
import com.davidherrerojimenez.androidapptestsample.base.dialogs.ErrorDialog;
import com.davidherrerojimenez.androidapptestsample.home.HomeActivity;

import static com.davidherrerojimenez.androidapptestsample.base.Constants.ERROR_DIALOG_FRAGMENT_TAG;
import static com.davidherrerojimenez.androidapptestsample.base.Constants.LOGIN_FRAGMENT_TAG;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginPresenterImpl(this);

        LoginFragment loginFragment = LoginFragment.newInstance();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, loginFragment, LOGIN_FRAGMENT_TAG).commit();
    }

    public void goHomeIfUserValidated(String email, String password) {

        loginPresenter.validateUser(email, password);

    }

    @Override
    public void goHome() {
        Intent intentHome = new Intent(this, HomeActivity.class);
        startActivity(intentHome);
        finish();
    }

    @Override
    public void setEmailError() {

        showErrorDialog(R.string.error_email);

    }

    @Override
    public void setPasswordError() {

        showErrorDialog(R.string.error_password);

    }


    public void showErrorDialog(int errorMsg) {

        DialogFragment newFragment = ErrorDialog.newInstance(
                errorMsg);
        newFragment.show(getSupportFragmentManager(), ERROR_DIALOG_FRAGMENT_TAG);

    }


}

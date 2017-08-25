package com.davidherrerojimenez.androidapptestsample.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.davidherrerojimenez.androidapptestsample.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Proyect: EspressoExample.
 * Package name: com.davidherrerojimenez.androidapptestsample.login.
 * Created by udhj1a on 23/08/2017 12:18.
 */

public class LoginFragment extends Fragment implements View.OnClickListener {

    @BindView(R.id.input_email)
    EditText inputEmail;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.signin)
    Button signIn;

    public LoginFragment() {
    }

    public static LoginFragment newInstance() {

        Bundle args = new Bundle();

        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View loginView = inflater.inflate(R.layout.fragment_login, container, false);

        ButterKnife.bind(this, loginView);


        signIn.setOnClickListener(this);

        return loginView;

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signin:
//TODO aqui me estoy saltando todas las reglas creo
                ((LoginActivity) getActivity()).goHomeIfUserValidated(getInputEmail(), getInputPassword());
                break;
        }
    }


    public String getInputEmail() {
        return inputEmail.getText().toString();
    }

    public String getInputPassword() {
        return inputPassword.getText().toString();
    }


}

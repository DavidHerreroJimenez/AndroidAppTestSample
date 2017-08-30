package com.davidherrerojimenez.androidapptestsample.base;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;

import com.davidherrerojimenez.androidapptestsample.R;

/**
 * Proyect: AndroidAppTestSample.
 * Package name: com.davidherrerojimenez.androidapptestsample.base.
 * Created by udhj1a on 30/08/2017 15:21.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.base_menu, menu);

        return true;
    }
}

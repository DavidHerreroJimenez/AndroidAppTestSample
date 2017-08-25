package com.davidherrerojimenez.androidapptestsample.base.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.davidherrerojimenez.androidapptestsample.R;

import static com.davidherrerojimenez.androidapptestsample.base.Constants.ERROR_FRAGMENT_TITLE_TAG;

/**
 * Proyect: EspressoExample.
 * Package name: com.davidherrerojimenez.androidapptestsample.base.dialogs.
 * Created by udhj1a on 23/08/2017 17:12.
 */

public class ErrorDialog extends DialogFragment {

    public ErrorDialog() {
    }

    public static ErrorDialog newInstance(int title) {

        Bundle args = new Bundle();

        args.putInt(ERROR_FRAGMENT_TITLE_TAG, title);

        ErrorDialog fragment = new ErrorDialog();
        fragment.setArguments(args);
        return fragment;
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        int title = getArguments().getInt(ERROR_FRAGMENT_TITLE_TAG);


        return new AlertDialog.Builder(getActivity())
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle(title)
                .setPositiveButton(R.string.accept_alert,
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                            }
                        }
                ).create();
    }
}

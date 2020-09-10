package com.kevine.askbuddy;

import android.text.TextUtils;
import android.widget.EditText;

public class StringUtilities {

    public static boolean checkFilledEditText(EditText editText, String errorMessage) {
        if (TextUtils.isEmpty(editText.getText().toString())) {
            editText.setError(errorMessage);
            return false;
        } else {
            return true;
        }
    }
}

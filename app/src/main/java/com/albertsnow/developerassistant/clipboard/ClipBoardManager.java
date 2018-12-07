package com.albertsnow.developerassistant.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class ClipBoardManager {

    public static final String TEXT_LABEL_NAME = "simple text";
    public static final String EXTERNAL_KEY_COPY_DAT = "copy_string";

    public static void copy(Context context, Intent intent) {
        String text = intent.getStringExtra(EXTERNAL_KEY_COPY_DAT);
        if (!TextUtils.isEmpty(text)) {
            copy(context, text);
        }
    }

    public static void copy(Context context, String copyText) {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard == null) {
            return;
        }

        ClipData clipData = ClipData.newPlainText(TEXT_LABEL_NAME, copyText);
        clipboard.setPrimaryClip(clipData);
    }

}

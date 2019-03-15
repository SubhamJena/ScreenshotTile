package com.github.ipcjs.screenshottile.ui.activity;

import android.app.Activity;
import android.os.Bundle;

import com.github.ipcjs.screenshottile.ui.SettingDialogFragment;

/**
 * Created by ipcjs on 2017/8/16.
 */

public class SettingDialogActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            SettingDialogFragment.Companion.newInstance().show(getFragmentManager(), SettingDialogFragment.class.getName());
        }
    }
}

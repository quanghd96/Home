package com.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmManagerBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startActivity(new Intent(context, AlertActivity.class));
    }
}

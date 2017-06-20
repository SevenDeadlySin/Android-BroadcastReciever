package com.raksa.orderedbroadcastreciever.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by User on 6/20/2017.
 */

public class ThirdReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"The Data was sent to ThirdReciever !",Toast.LENGTH_SHORT).show();
    }
}

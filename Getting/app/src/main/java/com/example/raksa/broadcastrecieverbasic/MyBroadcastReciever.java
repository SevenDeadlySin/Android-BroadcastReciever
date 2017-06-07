package com.example.raksa.broadcastrecieverbasic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Raksa on 6/7/2017.
 */

public class MyBroadcastReciever extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {

        Log.i("Reciever Info Message :"," A Message was Deliveried to MyBroadcastReciever");
        Toast.makeText(context,"The Message was deliveried from The Broadcast!!",Toast.LENGTH_SHORT).show();


    }
}

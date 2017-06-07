package com.example.raksa.broadcastrecieverbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSendBroadCastButtonClick(View view) {

        //Send BroadCast to MyBroadcastReciever..
        Intent sendBroadCastIntent = new Intent(this,MyBroadcastReciever.class);
        sendBroadcast(sendBroadCastIntent);

    }
}

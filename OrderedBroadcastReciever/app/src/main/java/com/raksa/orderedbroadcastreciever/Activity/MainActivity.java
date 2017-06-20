package com.raksa.orderedbroadcastreciever.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.raksa.orderedbroadcastreciever.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendBroadcastButtonClick(View view) {

        Intent broadIntent = new Intent("my.custom.reciever");
        sendBroadcast(broadIntent);

    }
}

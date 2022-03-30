package com.example.yasser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        Log.e( "onCreate: ",message.toString() );
    }

    public void go(View view) {
        Intent iii = new Intent(this,Order.class);
        iii.putExtra("EX",message);
        startActivity(iii);
    }
}
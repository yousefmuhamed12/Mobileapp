package com.example.yasser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Order extends AppCompatActivity {
     String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        message = intent.getStringExtra("EX");
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);


    }

    public void Back(View view) {
        Intent ii = new Intent(this,MainActivity.class);
        startActivity(ii);
    }
}
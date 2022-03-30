package com.example.yasser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE= "mo7a";
    private EditText Ex;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ex=findViewById(R.id.editText_main);
    }

    public void Launch(View view) {
        Intent i = new Intent(this,MainActivity2.class);
        String message = Ex.getText().toString();
        i.putExtra(EXTRA_MESSAGE, message);
        startActivity(i);

    }
}
package com.example.dabba.assignment4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class first extends Activity {

    Button b1;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        b1 = (Button) findViewById(R.id.op);}

    public void open(View view) {
        Intent i1 = new Intent(first.this, MainActivity.class);
        startActivity(i1);
        finish();
    }
}

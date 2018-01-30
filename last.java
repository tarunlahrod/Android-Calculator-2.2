package com.example.dabba.assignment4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class last extends Activity {

    Button y,n;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastpage);
        y=(Button) findViewById(R.id.yes);
        n=(Button) findViewById(R.id.no);

    }

    public void YES(View view)
    {
        finish();
        System.exit(0);
    }

    public void NO(View view)
    {
        Intent i3 = new Intent(last.this, MainActivity.class);
        startActivity(i3);
    }
}

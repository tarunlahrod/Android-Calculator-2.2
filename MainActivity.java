package com.example.dabba.assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public float data=0,data1=0, data2=0;
    public int flag=0;
    public String scrdata="",scrdata2="0";

    TextView screen,screen2,operator,monitor;
    Button but0,but1,but2,but3,but4,but5,but6,but7,but8,but9,butsum,butsub,butmul,butdiv,buteq,butac,butdec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=(TextView) findViewById(R.id.scr);
        screen2=(TextView)findViewById(R.id.scr2);
        operator=(TextView) findViewById(R.id.opr);
        monitor=(TextView) findViewById(R.id.sym);
        but0=(Button) findViewById(R.id.b0);
        but1=(Button) findViewById(R.id.b1);
        but2=(Button) findViewById(R.id.b2);
        but3=(Button) findViewById(R.id.b3);
        but4=(Button) findViewById(R.id.b4);
        but5=(Button) findViewById(R.id.b5);
        but6=(Button) findViewById(R.id.b6);
        but7=(Button) findViewById(R.id.b7);
        but8=(Button) findViewById(R.id.b8);
        but9=(Button) findViewById(R.id.b9);
        butsum=(Button) findViewById(R.id.sum);
        butsub=(Button) findViewById(R.id.sub);
        butmul=(Button) findViewById(R.id.x);
        butdiv=(Button) findViewById(R.id.div);
        butdec=(Button) findViewById(R.id.dec);
        butac=(Button) findViewById(R.id.ac);
        buteq=(Button)findViewById(R.id.eq);
    }

    public void zero(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="0");
        }
        else
        {
            screen2.setText(scrdata2+="0");
        }
    }

    public void one(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="1");
        }
        else
        {
            screen2.setText(scrdata2+="1");
        }
    }


    public void two(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="2");
        }
        else
        {
            screen2.setText(scrdata2+="2");
        }
    }

    public void three(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="3");
        }
        else
        {
            screen2.setText(scrdata2+="3");
        }
    }

    public void four(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="4");
        }
        else
        {
            screen2.setText(scrdata2+="4");
        }
    }

    public void five(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="5");
        }
        else
        {
            screen2.setText(scrdata2+="5");
        }
    }

    public void six(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="6");
        }
        else
        {
            screen2.setText(scrdata2+="6");
        }
    }

    public void seven(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="7");
        }
        else
        {
            screen2.setText(scrdata2+="7");
        }
    }

    public void eight(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="8");
        }
        else
        {
            screen2.setText(scrdata2+="8");
        }
    }

    public void nine(View view)
    {
        if(flag==0)
        {
            screen.setText(scrdata+="9");
        }
        else
        {
            screen2.setText(scrdata2+="9");
        }
    }

    public void add(View view)
    {
        data1 = Float.parseFloat(scrdata);
        operator.setText("+");
        flag=1;
    }

    public void minus(View view)
    {
        data1 = Float.parseFloat(scrdata);
        operator.setText("-");
        flag=2;
    }

    public void multi(View view)
    {
        data1 = Float.parseFloat(scrdata);
        operator.setText("x");
        flag=3;
    }

    public void divide(View view)
    {
        data1 = Float.parseFloat(scrdata);
        operator.setText("/");
        flag=4;
    }

    public void equal(View view)
    {
        data1 = Float.parseFloat(scrdata);
        data2 = Float.parseFloat(scrdata2);
        switch(flag)
        {
            case 1: data = data1+data2; break;
            case 2: data = data1-data2; break;
            case 3:{
                if(data2==0)
                    data = data1;
                else data = data1 * data2;
            } break;
            case 4: {
                if(data2==0)
                    data = data1;
                else data = data1/data2;
            } break;
        }
        monitor.setText(""+ data);
    }

    public void decimal(View view)
    {
        screen.setText(scrdata+=".");
    }

    public void AC(View view)
    {
        scrdata = "";
        scrdata2 = "0";
        operator.setText("");
        screen.setText("0");
        screen2.setText("0");
        monitor.setText("");
        flag=0;
        data=0;
        data1=0;
        data2=0;
    }

    public void onBackPressed()
    {       
        super.onBackPressed();
        Intent i2 = new Intent(MainActivity.this, last.class);
        startActivity(i2);
        //super.onDestroy();
    }
}





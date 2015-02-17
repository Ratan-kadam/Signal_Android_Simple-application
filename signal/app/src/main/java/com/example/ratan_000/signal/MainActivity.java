package com.example.ratan_000.signal;

import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static java.lang.System.*;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button greenon;
    private Button stop;
    private Button alert;
    private ImageView imageView1;
    private ImageView  imageView2;
    private ImageView imageView3;
    private ImageView imageView4;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageview1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
       // imageView4 = (ImageView)findViewById(R.id.imageView4);

        imageView1.setImageResource(R.drawable.redoff);
        imageView2.setImageResource(R.drawable.greenoff);
        imageView3.setImageResource(R.drawable.yellowoff);
       // imageView4.setImageResource(R.drawable.stick);

        greenon = (Button) findViewById(R.id.greenon);
        greenon.setOnClickListener(this);
        stop = (Button) findViewById(R.id.stop);
        stop.setOnClickListener(this);
        alert = (Button)findViewById(R.id.alert);
        alert.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    void doSomething()
    {
        out.print("Entered to do Some thing ..");

        imageView3.setImageResource(R.drawable.yellowoff);
        imageView1.setImageResource(R.drawable.greenon);
        imageView2.setImageResource(R.drawable.redoff);

    }
    void doSomething1()
    {
        out.print("Entered to do Some thing1 ..");
        imageView3.setImageResource(R.drawable.yellowoff);
        imageView1.setImageResource(R.drawable.greenoff);
        imageView2.setImageResource(R.drawable.redon);

    }
    void doSomething3()
    {
        out.print("Entered to do Some thing ..");


        imageView1.setImageResource(R.drawable.greenoff);
        imageView2.setImageResource(R.drawable.redoff);
        imageView3.setImageResource(R.drawable.yellowon);

    }
    @Override
    public void onClick(View v) {
        int choise = v.getId();
        out.println("enterred ..");
       switch(choise)
        {
            case R.id.greenon:
                out.print("Go button pressed..");
                doSomething();
                break;
            case R.id.stop:
                out.print("Stop button pressed");
                doSomething1();
                break;
            case R.id.alert:
                out.print("Alert");
                doSomething3();
                break;
            default:
                break;
        }
    }
}

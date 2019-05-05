package com.example.ege.androidthreads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.logging.Handler ;

public class MainActivity extends AppCompatActivity {
    android.widget.ProgressBar progBar;
    Handler countHandler = new Handler()
    {
    };
    @android.annotation.SuppressLint("WrongViewCast")@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progBar = findViewById(R.id.progressBar);
    }

    public void startProgress_click(android.view.View v)
    {


    }

    class CountThread extends Thread
    {
        public void run()
        {
            int count=0;
            while(count<100)
            {count++;
                Thread.sleep(100);
            }
        }
    }
}

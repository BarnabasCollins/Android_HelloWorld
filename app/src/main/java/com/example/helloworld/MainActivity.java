package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt= findViewById(R.id.HelloWorld);
        btn= findViewById(R.id.Hello);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v) {
                txt.setText("Hello World!");

            }
        });
    }
}

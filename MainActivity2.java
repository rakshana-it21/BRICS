
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import  android.content.Intent;
import android .view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public TextView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (TextView) findViewById(R.id.Register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}

package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view){
        num=0;
        display("0000");
    }

    public void increment(View view){
        String count="";
        num+=1;
        for(int i=0; i<4-String.valueOf(num).length(); i++){
            count+="0";
        }
        display(count+String.valueOf(num));
    }

    private void display(String num){
        TextView count = (TextView) findViewById(R.id.count_id);
        count.setText(num);
    }
}
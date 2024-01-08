package com.example.yalimarcexe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button bt;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.button);
        bt.setText("Click Me");
    }

    public void exe(View view) {
        count++;
        String str="This is a click number:"+count;
        bt.setText(str);
        if (count==6){
            bt.setText("Enough to click. Go to new start!");
            count=0;}

    }
}
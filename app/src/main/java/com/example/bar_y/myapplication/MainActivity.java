package com.example.bar_y.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
    }
    public void btnclick(View view) {
        btn.setText("This is the Click num:"+i);
        i++;
        if (i>6){
            btn.setText("Enough to click. Go to new start!");
            i=1;}
    }
}

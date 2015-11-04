package com.lee.setstatusbarclolor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        int viewId = view.getId();
        if (viewId == R.id.button) {
            Intent intent = new Intent(this, Example1Activity.class);
            startActivity(intent);
        } else if (viewId == R.id.button2) {
            Intent intent = new Intent(this, Example2Activity.class);
            startActivity(intent);
        }
    }

}

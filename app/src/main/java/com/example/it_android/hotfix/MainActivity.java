package com.example.it_android.hotfix;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startClick(View view) {

        SimpleHotFixBugTest test = new SimpleHotFixBugTest();
        test.getBug(this);

    }

    // “修复”按钮的点击事件

    public void fix(View view) {

        File file = FixDexUtils.loadFixedDex(this, Environment.getExternalStorageDirectory());

        if (file.exists()) {
            //修复bug

            Toast.makeText(this, "修复成功", Toast.LENGTH_SHORT).show();
        }

    }



}

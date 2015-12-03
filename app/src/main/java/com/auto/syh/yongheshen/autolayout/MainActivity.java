package com.auto.syh.yongheshen.autolayout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);
        getHW();
    }
    
    private void getHW()
    {
        // 获取屏幕宽高（方法1）
        int screenWidth = getWindowManager().getDefaultDisplay().getWidth(); // 屏幕宽（像素，如：480px）
        int screenHeight = getWindowManager().getDefaultDisplay().getHeight(); // 屏幕高（像素，如：800p）
        Toast.makeText(MainActivity.this, screenWidth + "x" + screenHeight, Toast.LENGTH_SHORT).show();
        System.out.println(screenWidth + "x" + screenHeight);
    }
}

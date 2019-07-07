package com.example.lesson3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ABC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate_Toast 基本用法", Toast.LENGTH_LONG).show();
    }

    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume 事件", Toast.LENGTH_LONG).show();
        Log.v(TAG,"onResume測試");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause 事件", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onPause測試");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop 事件", Toast.LENGTH_LONG).show();
        Log.e(TAG,"onStop測試");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart 事件", Toast.LENGTH_LONG).show();
        Log.w(TAG,"onRestart測試");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy 事件", Toast.LENGTH_LONG).show();
        Log.d("sheldon","onDestroy測試");
    }
}

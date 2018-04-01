package com.example.mlr.ch6_3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int num1 ,num2; //宣告num1、num2為整數變數(private私有成員只能在自己的類別中使用)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用亂數取得點數
        num1 = (int) (Math.random()*12)+1; //亂數值為0~12，+1後變為1~13
        num2 = (int) (Math.random()*12)+1; //亂數值為0~12，+1後變為1~13
    }
}

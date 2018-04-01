package com.example.mlr.ch6_3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int num1 ,num2; //宣告num1、num2為整數變數(private私有成員只能在自己的類別中使用)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用亂數取得點數
        num1 = (int) (Math.random()*12)+1; //亂數值為0~12，+1後變為1~13
        num2 = (int) (Math.random()*12)+1; //亂數值為0~12，+1後變為1~13
        //註冊 Button 的傾聽者物件
        Button btn1 = (Button) findViewById(R.id.btn1); //找到button的id為btn1，findViewById()方法的傳回值是View物件，所以需要型別強制轉換成button元件
        btn1.setOnClickListener(btn1Listener); //使用動態綁定OnClick：setOnClickListner()方法指定btn1的lisetener物件
        Button btn2 = (Button) findViewById(R.id.btn2); //找到button的id為btn2
        btn2.setOnClickListener(btn2listener); //使用動態綁定OnClick：setOnClickListner()方法指定btn1的lisetener物件
    }

    //btn1的傾聽者物件
    View.OnClickListener btn1Listener = new View.OnClickListener() { // 由 View.OnClickListener(類別)建立 btn1listener(物件)，類別名稱 物件名稱 = new 類別名稱
        @Override
        public void onClick(View v) { //宣告onClick方法
            Toast.makeText(MainActivity.this,Integer.toString(num1),Toast.LENGTH_SHORT).show(); //當監聽到OnClick方法時，會顯示彈跳訊息框
        }
    };
    //btn2的傾聽者物件
    View.OnClickListener btn2listener = new View.OnClickListener() { // 由 View.OnClickListener(類別)建立 btn2listener(物件)
        @Override
        public void onClick(View v) { //宣告onClick方法
            Toast.makeText(MainActivity.this,Integer.toString(num2),Toast.LENGTH_SHORT).show(); //當監聽到onClick方法時，會顯示彈跳訊息框
        }
    };
}

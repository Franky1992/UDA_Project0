package com.example.franky.uda_project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void openPrj1(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Opening project 热门电影 ...", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void openPrj2(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Opening project 股票雄鹰 ...", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void openPrj3(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Opening project XYZ 阅读器 ...", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void openPrj4(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Opening project 最新闻 ...", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void openPrj5(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Opening project 毕业设计 ...", Toast.LENGTH_SHORT);
        toast.show();
    }

}

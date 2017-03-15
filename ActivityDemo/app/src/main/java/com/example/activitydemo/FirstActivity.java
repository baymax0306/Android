package com.example.activitydemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode)
        {
            case 1:
                if (resultCode == RESULT_OK)
                {
                    String returnData = data.getStringExtra("data_return");

                    Toast.makeText(this, returnData, Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity onCreate", this.toString());
        setContentView(R.layout.first_layout);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
           public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "you clicked button1!", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(FirstActivity.this, "destroy activity!", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //隐式Intent示范
                Intent intent = new Intent("com.example.activity.ACTION_START");
                String str = "爱你哈哈";
                intent.putExtra("data", str);
                startActivity(intent);
            }
        });

        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //使用内置Intent
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
               startActivityForResult(intent, 1);
           }
        });

        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View v){
              Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
              startActivity(intent);
          }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

   /* @Override
    public boolean onContextItemSelected(MenuItem item) {
                Toast.makeText(this, "you clicked " + item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (R.id.second_activity != item.getItemId()) {
            Toast.makeText(this, "you clicked " + item.getTitle(), Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FirstActivity onDestroy", this.toString());
    }
}























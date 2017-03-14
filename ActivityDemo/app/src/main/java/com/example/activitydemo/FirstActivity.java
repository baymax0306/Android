package com.example.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(this, "you clicked add_item.", Toast.LENGTH_SHORT).show();
                break;

            case R.id.del_item:
                Toast.makeText(this, "you clicked del_item", Toast.LENGTH_SHORT).show();
                break;

            case R.id.second_activity:

                break;

            default:
                break;
        }

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v) {

               Toast.makeText(FirstActivity.this, "你点击了测试按钮1", Toast.LENGTH_SHORT).show();
           }

        });
    }
}

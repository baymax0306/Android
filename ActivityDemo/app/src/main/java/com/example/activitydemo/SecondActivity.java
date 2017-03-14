package com.example.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello FirstActivity");
                setResult(RESULT_OK, intent);
                Toast.makeText(SecondActivity.this, "活动二结束", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        if (null != data)
            Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
           public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "you clicked button1!", Toast.LENGTH_SHORT).show();
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
        Toast.makeText(this, "you clicked " + item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}























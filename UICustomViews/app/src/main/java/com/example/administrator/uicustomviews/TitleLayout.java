package com.example.administrator.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/3/21.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attrs){
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button back = (Button)findViewById(R.id.title_back);
        Button edit = (Button)findViewById(R.id.title_edit);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ((Activity)getContext()).finish();
            }
        });

        edit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getContext(), "You clicked Edit button", Toast.LENGTH_SHORT).show();
            }
        });

    }

}

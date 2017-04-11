package com.qiantao.coordinatormenudemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.qiantao.coordinatormenu.CoordinatorMenu;

public class MainActivity extends AppCompatActivity {
    private ImageView mHeadIv;
    private CoordinatorMenu mCoordinatorMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHeadIv = (ImageView) findViewById(R.id.iv_head);
        mCoordinatorMenu = (CoordinatorMenu) findViewById(R.id.menu);

        mHeadIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mCoordinatorMenu.isOpened()) {
                    mCoordinatorMenu.closeMenu();
                } else {
                    mCoordinatorMenu.openMenu();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (mCoordinatorMenu.isOpened()) {
            mCoordinatorMenu.closeMenu();
        } else {
            super.onBackPressed();
        }
    }

    public void onClick(View v){
        if (!mCoordinatorMenu.isOpened())
            return;
        String strText="";
        switch (v.getId())
        {
            case R.id.item_milk:
                strText = "click milk.";
                break;
            case R.id.book:
                strText = "click book.";
                break;

            case R.id.item_basketball:
                strText = "click basketball.";
                break;

            case R.id.game:
                strText = "click game.";
                break;

            default:
                break;
        }



        Toast.makeText(this, strText, Toast.LENGTH_SHORT).show();
    }
}

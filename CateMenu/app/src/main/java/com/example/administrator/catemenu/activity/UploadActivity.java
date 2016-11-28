package com.example.administrator.catemenu.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.administrator.catemenu.R;

/**
 * Created by abc on 2016/11/28.
 */
public class UploadActivity extends Activity{
    ImageView backBtn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        backBtn = (ImageView) findViewById(R.id.back_btn);

        backBtn.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.back_btn:
                    intent = new Intent(UploadActivity.this,MineActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}

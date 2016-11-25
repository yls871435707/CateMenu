package com.example.administrator.catemenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by abc on 2016/11/25.
 */
public class AttentionActivity extends Activity {
    ImageView backBtn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention);

        backBtn = (ImageView) findViewById(R.id.back_btn);
        backBtn.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.back_btn:
                    intent = new Intent(AttentionActivity.this,MineActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}

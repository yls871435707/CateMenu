package com.example.administrator.catemenu;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Administrator on 2016/10/20.
 */
public class HomePageActivity extends Activity {
    View fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        fragment=findViewById(R.id.fragment);

    }
}

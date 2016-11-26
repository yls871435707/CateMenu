package com.example.administrator.catemenu.activity;

import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.LinearLayout;
import android.widget.RadioButton;

import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.fragment.ClassifyFragment;
import com.example.administrator.catemenu.fragment.FeastFragment;
import com.example.administrator.catemenu.fragment.HomepageFragment;
import com.example.administrator.catemenu.fragment.ShopFragment;
import com.example.administrator.catemenu.fragment.SquareFragment;

/**
 * Created by Administrator on 2016/10/20.
 */
public class HomePageActivity extends Activity {
    HomepageFragment homepageFragment;
    ClassifyFragment classifyFragment;
    ShopFragment shopFragment;
    FeastFragment feastFragment;
    SquareFragment squareFragment;
    LinearLayout linearLayout;
    RadioButton homepageBtn;
    RadioButton classifyBtn;
    RadioButton shopBtn;
    RadioButton feastBtn;
    RadioButton squareBtn;


    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        linearLayout = (LinearLayout) findViewById(R.id.ll);

        homepageBtn = (RadioButton) findViewById(R.id.rb_homepage);
        classifyBtn = (RadioButton) findViewById(R.id.rb_classify);
        shopBtn = (RadioButton) findViewById(R.id.rb_shop);
        feastBtn = (RadioButton) findViewById(R.id.rb_feast);
        squareBtn = (RadioButton) findViewById(R.id.rb_square);


        homepageBtn.setOnClickListener(clickListener);
        classifyBtn.setOnClickListener(clickListener);
        shopBtn.setOnClickListener(clickListener);
        feastBtn.setOnClickListener(clickListener);
        squareBtn.setOnClickListener(clickListener);


        homepageBtn.setChecked(true);
        if (homepageBtn.isChecked()) {
            addHomepageFragment();
        }
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (v.getId()) {
                case R.id.rb_homepage:
                    if (homepageFragment == null) {
                        homepageFragment = new HomepageFragment();
                    }
                    transaction.replace(R.id.ll, homepageFragment);
                    break;
                case R.id.rb_classify:
                    if (classifyFragment == null) {
                        classifyFragment = new ClassifyFragment();
                    }
                    transaction.replace(R.id.ll, classifyFragment);
                    break;
                case R.id.rb_shop:
                    if (shopFragment==null){
                        shopFragment=new ShopFragment();
                    }
                    transaction.replace(R.id.ll,shopFragment);
                    break;
                case R.id.rb_feast:
                    if (feastFragment==null){
                        feastFragment=new FeastFragment();
                    }
                    transaction.replace(R.id.ll,feastFragment);
                    break;
                case R.id.rb_square:
                    if(squareFragment==null){
                        squareFragment=new SquareFragment();
                    }
                    transaction.replace(R.id.ll,squareFragment);
                    break;
                case R.id.more_imgview:
                    break;
                case R.id.head_imageview:
                    intent = new Intent(HomePageActivity.this,MineActivity.class);
                    startActivity(intent);
                    break;
            }
            transaction.commit();
        }
    };

    public void addHomepageFragment() {
        homepageFragment = new HomepageFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ll, homepageFragment);
        fragmentTransaction.commit();
    }
}

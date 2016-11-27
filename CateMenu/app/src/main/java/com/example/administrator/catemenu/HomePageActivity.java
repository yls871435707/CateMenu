package com.example.administrator.catemenu;

import android.app.Activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import com.fragment.ClassifyFragment;
import com.fragment.FeastFragment;
import com.fragment.HomepageFragment;
import com.fragment.ShopFragment;
import com.fragment.SquareFragment;

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
    RadioButton homepagerb;
    RadioButton classifyrb;
    RadioButton shoprb;
    RadioButton feastrb;
    RadioButton squarerb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        linearLayout = (LinearLayout) findViewById(R.id.ll);
        homepagerb = (RadioButton) findViewById(R.id.rb_homepage);
        classifyrb = (RadioButton) findViewById(R.id.rb_classify);
        shoprb = (RadioButton) findViewById(R.id.rb_shop);
        feastrb = (RadioButton) findViewById(R.id.rb_feast);
        squarerb = (RadioButton) findViewById(R.id.rb_square);
        homepagerb.setOnClickListener(clickListener);
        classifyrb.setOnClickListener(clickListener);
        shoprb.setOnClickListener(clickListener);
        feastrb.setOnClickListener(clickListener);
        squarerb.setOnClickListener(clickListener);

        homepagerb.setChecked(true);
        if (homepagerb.isChecked()) {
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
                case R.id.rb_shop:  //餐具控件
                    if (shopFragment==null){
                        shopFragment=new ShopFragment();
                        FragmentManager fragmentManagerShop = getFragmentManager();
                        FragmentTransaction fragmentTransactionShop = fragmentManagerShop.beginTransaction();
                        fragmentTransactionShop.replace(R.id.ll,shopFragment);
                        fragmentTransactionShop.commit();
                    }
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

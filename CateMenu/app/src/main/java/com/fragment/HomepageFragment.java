package com.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.administrator.catemenu.R;

/**
 * Created by Administrator on 2016/11/11.
 */
public class HomepageFragment extends Fragment implements View.OnClickListener {
    RadioButton breakfast;
    RadioButton desssert;
    RadioButton dinner;
    RadioButton lunch;
    ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_homepage, null);
        breakfast = (RadioButton) view.findViewById(R.id.btn_breakfast);
        desssert = (RadioButton) view.findViewById(R.id.btn_dessert);
        dinner = (RadioButton) view.findViewById(R.id.btn_dinner);
        lunch = (RadioButton) view.findViewById(R.id.btn_lunch);
        viewPager = (ViewPager) view.findViewById(R.id.viewpager);
        breakfast.setOnClickListener(this);
        desssert.setOnClickListener(this);
        dinner.setOnClickListener(this);
        lunch.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_breakfast:
                if (breakfast.isChecked() ==true){
                    desssert.setChecked(false);
                    dinner.setChecked(false);
                    lunch.setChecked(false);
                }
                break;
            case R.id.btn_dessert:
                if (desssert.isChecked() ==true){
                    breakfast.setChecked(false);
                    dinner.setChecked(false);
                    lunch.setChecked(false);
                }
                break;
            case R.id.btn_dinner:
                if (dinner.isChecked() ==true){
                    breakfast.setChecked(false);
                    desssert.setChecked(false);
                    lunch.setChecked(false);
                }
                break;
            case R.id.btn_lunch:
                if (lunch.isChecked() ==true){
                    breakfast.setChecked(false);
                    desssert.setChecked(false);
                    dinner.setChecked(false);
                }
                break;
        }
    }
}

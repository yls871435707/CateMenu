package com.example.administrator.catemenu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.adapter.OrderAdapter;
import com.example.administrator.catemenu.modle.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abc on 2016/11/11.
 */
public class MyFoodOrderActivity extends Activity {
    ListView listView;
    List<Order> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_my_order);
        listView = (ListView) findViewById(R.id.my_order_listview);
        list = getData();
        OrderAdapter orderAdapter = new OrderAdapter(this,list);
        listView.setAdapter(orderAdapter);
    }
    public List<Order> getData(){
       list = new ArrayList<>();
        for (int i=0;i<10;i++){
            Order order = new Order();
            order.setImage(R.mipmap.hongtanmu);
            order.setName("鸿拓天然红木筷子");
            order.setCaiZi("天然木材");
            order.setPrice(25.0);
            order.setNumber(1);
            order.setState("已支付");
        }
        return list;
    }
}

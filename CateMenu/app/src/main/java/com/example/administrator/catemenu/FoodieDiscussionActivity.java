package com.example.administrator.catemenu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.Adapter.FoodXjqbAdapter;
import com.Adapter.MeatItemAdapter;
import com.modle.FoodXjqb;
import com.modle.MeatItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abc on 2016/11/11.
 */
public class FoodieDiscussionActivity extends Activity {
    ListView xjqbCommentListview;
    List<FoodXjqb> foodXjqbList = new ArrayList<FoodXjqb>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodie_discussion);

        getData();
        xjqbCommentListview = (ListView) findViewById(R.id.xjqb_comment_listview);
        FoodXjqbAdapter foodXjqbAdapter = new FoodXjqbAdapter(this,foodXjqbList);
        xjqbCommentListview.setAdapter(foodXjqbAdapter);
    }

    public void getData(){
        for(int i=0;i<10;i++){
            FoodXjqb foodXjqb = new FoodXjqb();
            foodXjqbList.add(foodXjqb);
        }
    }
}

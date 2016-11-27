package com.example.administrator.catemenu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
<<<<<<< HEAD
import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.adapter.FoodXjqbAdapter;
import com.example.administrator.catemenu.modle.FoodXjqb;
=======

<<<<<<< HEAD:CateMenu/app/src/main/java/com/example/administrator/catemenu/FoodieDiscussionActivity.java
import com.adapter.FoodXjqbAdapter;
import com.modle.FoodXjqb;
=======


import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.adapter.FoodXjqbAdapter;
import com.example.administrator.catemenu.modle.FoodXjqb;

>>>>>>> 72c5b82c51861485b4d8a1c9ab9c78987fefa0f1
>>>>>>> df0f1907e266e625386acc3cff01f76cabb3645b:CateMenu/app/src/main/java/com/example/administrator/catemenu/activity/FoodieDiscussionActivity.java

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

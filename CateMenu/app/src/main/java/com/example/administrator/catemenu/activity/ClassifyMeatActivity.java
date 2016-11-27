package com.example.administrator.catemenu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.adapter.MeatItemAdapter;
import com.example.administrator.catemenu.modle.MeatItem;

<<<<<<< HEAD
=======
<<<<<<< HEAD:CateMenu/app/src/main/java/com/example/administrator/catemenu/ClassifyMeatActivity.java
import com.adapter.MeatItemAdapter;
import com.modle.MeatItem;
=======
import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.adapter.MeatItemAdapter;
import com.example.administrator.catemenu.modle.MeatItem;
>>>>>>> df0f1907e266e625386acc3cff01f76cabb3645b:CateMenu/app/src/main/java/com/example/administrator/catemenu/activity/ClassifyMeatActivity.java


>>>>>>> 72c5b82c51861485b4d8a1c9ab9c78987fefa0f1
>>>>>>> 6aa24cba313f08e139c28195f2c312d35811780b
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abc on 2016/11/11.
 */
public class ClassifyMeatActivity extends Activity {
    ListView huncaiListview;
    List<MeatItem> meatItemList = new ArrayList<MeatItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classify_meat);

        getData();
        huncaiListview = (ListView) findViewById(R.id.huncai_listview);
        MeatItemAdapter meatItemAdapter = new MeatItemAdapter(this,meatItemList);
        huncaiListview.setAdapter(meatItemAdapter);
    }

    public void getData(){
        for(int i=0;i<10;i++){
            MeatItem meatItem = new MeatItem();
            meatItem.setHuncaiNanduLevelTextview("初级");
            meatItemList.add(meatItem);
        }
    }
}

<<<<<<< HEAD:CateMenu/app/src/main/java/com/Adapter/MeatItemAdapter.java
package com.adapter;
=======
package com.example.administrator.catemenu.adapter;
<<<<<<< HEAD
=======
>>>>>>> df0f1907e266e625386acc3cff01f76cabb3645b:CateMenu/app/src/main/java/com/example/administrator/catemenu/adapter/MeatItemAdapter.java

import android.widget.BaseAdapter;
>>>>>>> 72c5b82c51861485b4d8a1c9ab9c78987fefa0f1

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.modle.MeatItem;

import java.util.List;

/**
 * Created by Administrator on 2016/11/15.
 */
public class MeatItemAdapter extends BaseAdapter {
    Context context;
    List<MeatItem> meatItemList;
    LayoutInflater layoutInflater;
    public MeatItemAdapter(Context context, List<MeatItem> meatItemList) {
        this.context = context;
        this.meatItemList = meatItemList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return meatItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return meatItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view != null){
            view = layoutInflater.inflate(R.layout.listview_homepage_huncai_item,null);
        }
        return view;
    }
}

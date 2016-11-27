<<<<<<< HEAD:CateMenu/app/src/main/java/com/Adapter/FoodXjqbAdapter.java
package com.adapter;
=======
package com.example.administrator.catemenu.adapter;
>>>>>>> df0f1907e266e625386acc3cff01f76cabb3645b:CateMenu/app/src/main/java/com/example/administrator/catemenu/adapter/FoodXjqbAdapter.java

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.administrator.catemenu.R;
import com.example.administrator.catemenu.modle.FoodXjqb;

import java.util.List;

/**
 * Created by Administrator on 2016/11/15.
 */
public class FoodXjqbAdapter extends BaseAdapter {
    Context context;
    List<FoodXjqb> foodXjqbList;
    LayoutInflater layoutInflater;
    public FoodXjqbAdapter(Context context, List<FoodXjqb> foodXjqbList) {
        this.context = context;
        this.foodXjqbList = foodXjqbList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return foodXjqbList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodXjqbList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view != null){
            view = layoutInflater.inflate(R.layout.listview_xjqb_comment_item,null);
        }
        return view;
    }
}

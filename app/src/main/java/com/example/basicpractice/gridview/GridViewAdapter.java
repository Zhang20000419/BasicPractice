package com.example.basicpractice.gridview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.basicpractice.R;

/**
 * Created by zzchuan
 * Created on
 * Updated on
 */
public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater mLayoutInflater;

    public GridViewAdapter(Context context){
        this.context = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class GridViewHolder{
        public ImageView imageView;
        private TextView textView1, textView2, textView3;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridViewHolder holder = null;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_gridview_item,null);
            holder = new GridViewHolder();
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.textView1 = convertView.findViewById(R.id.textView1);
            holder.textView2 = convertView.findViewById(R.id.textView2);
            holder.textView3 = convertView.findViewById(R.id.textView3);
            convertView.setTag(holder);
        }else {
            holder = (GridViewHolder) convertView.getTag();
        }

        //动态获取图片
        String imageName = "menhera"+ ++position;
        final int resId = context.getResources().getIdentifier(imageName, "drawable", context.getPackageName());
        if (resId != 0) {
            Log.e("picture load", "successful");
            holder.imageView.setImageResource(resId);
        }

        holder.textView1.setText("2000.04.19");
        holder.textView2.setText("四川");
        holder.textView3.setText("Birth");
        return convertView;
    }
}


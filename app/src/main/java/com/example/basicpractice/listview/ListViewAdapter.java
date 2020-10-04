package com.example.basicpractice.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.example.basicpractice.R;

/**
 * Created by zzchuan
 * Created on
 * Updated on
 */
public class ListViewAdapter extends BaseAdapter {

    private Context mcontext;
    private LayoutInflater mLayoutInflater;

    public ListViewAdapter(Context context){
        this.mcontext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ListViewHolder {
        public ImageView imageView;
        public TextView textView;
        public TextView tvTime;
        public TextView tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewHolder holder = null;
        if (convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder = new ListViewHolder();
            holder.imageView = convertView.findViewById(R.id.imageView);
            holder.textView = convertView.findViewById(R.id.textView1);
            holder.tvTime = convertView.findViewById(R.id.tvTime);
            holder.tvContent = convertView.findViewById(R.id.tvContent);
            convertView.setTag(holder);
        }else {
            holder = (ListViewHolder) convertView.getTag();
        }
        holder.tvContent.setText("裴秀智");
        Glide.with(mcontext).load("https://c-ssl.duitang.com/uploads/item/201710/23/20171023144345_aEHji.jpeg").into(holder.imageView);
        return convertView;
    }
}

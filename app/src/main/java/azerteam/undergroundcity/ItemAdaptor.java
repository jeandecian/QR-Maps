package com.example.listapp;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listapp.R;

/**
 * Created by User on 2018-01-21.
 */

public class ItemAdaptor extends BaseAdapter {

    LayoutInflater mInflater;
    String[] items;
    String[] schedule;
    String[] description;

    public ItemAdaptor (Context c, String[] i, String[] s, String[] d){
        items = i;
        schedule = s;
        description = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView scheduleTextView = (TextView) v.findViewById(R.id.scheduleTextView);

        String name = items[i];
        String desc = description[i];
        String sche = schedule[i];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        scheduleTextView.setText(sche);

        return v;
    }
}

package org.haqnawaz.mylearningapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String Alphabets[];
    int flag[];
    LayoutInflater inflater;

    public CustomAdapter(Context context, String[] alphabets, int[] flag) {
        this.context = context;
        Alphabets = alphabets;
        this.flag = flag;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return Alphabets.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView letters = view.findViewById(R.id.textView);
        ImageView images = view.findViewById(R.id.imageView);
        letters.setText(Alphabets[i]);
        images.setImageResource(flag[i]);
        return view;

    }
}

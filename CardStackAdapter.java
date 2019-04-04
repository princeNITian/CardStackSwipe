package com.example.prince.examplecard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class CardStackAdapter extends ArrayAdapter<Integer> {
    public CardStackAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @androidx.annotation.NonNull
    @NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable @Nullable View convertView, @androidx.annotation.NonNull @NonNull ViewGroup parent) {
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageview);
        imageView.setImageResource(getItem(position));
        return convertView;
    }
}

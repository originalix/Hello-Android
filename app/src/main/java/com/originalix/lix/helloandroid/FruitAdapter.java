package com.originalix.lix.helloandroid;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lix on 2017/8/5.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceID;

    public FruitAdapter(Context context, int textViewResourceID, List<Fruit> objects) {
        super(context, textViewResourceID, objects);
        resourceID = textViewResourceID;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceID, null);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setBackgroundResource(fruit.getColorID());
        fruitName.setText(fruit.getName());

        return view;
    }
}

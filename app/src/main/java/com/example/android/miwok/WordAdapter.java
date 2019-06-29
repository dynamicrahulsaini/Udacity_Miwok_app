package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,@NonNull ViewGroup parent) {

        View itemListView = convertView;
        if (itemListView == null) {
            itemListView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        Word words = getItem(position);

        TextView miwokTextView = itemListView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(words.getMiwokTranslation());

        TextView defaultTextView = itemListView.findViewById(R.id.default_text_view);
        defaultTextView.setText(words.getDefaultTranslation());

        ImageView descriptionImageView = itemListView.findViewById(R.id.description_image_view);
        descriptionImageView.setImageResource(words.getImageResourceId());

        return itemListView;
    }
}

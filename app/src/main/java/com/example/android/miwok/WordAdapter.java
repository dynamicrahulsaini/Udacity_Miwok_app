package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorResourceId = 0;

    public WordAdapter(Context context, List<Word> objects, int colorId) {
        super(context, 0, objects);
        mColorResourceId = colorId;
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
        if(words.getImageResourceId() == 0)
            descriptionImageView.setVisibility(View.GONE);
        else
            descriptionImageView.setImageResource(words.getImageResourceId());

        View view = itemListView.findViewById(R.id.text_linear_layout);
        int Color = ContextCompat.getColor(getContext(), mColorResourceId);
        view.setBackgroundColor(Color);

        return itemListView;
    }
}

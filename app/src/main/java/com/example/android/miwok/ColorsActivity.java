package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //This linearLayout is created to change background color when activity is created.
//        LinearLayout linearLayout = findViewById(R.id.list_view);
//        linearLayout.setBackgroundColor(getColor(R.color.category_colors));

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Red", "Weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("Green", "Chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "Takaakki", R.drawable.color_brown));
        words.add(new Word("Gray", "Topoppi", R.drawable.color_gray));
        words.add(new Word("Black", "Kululli", R.drawable.color_black));
        words.add(new Word("White", "Kelelli", R.drawable.color_white));
        words.add(new Word("Dusty yellow", "Topiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard yellow", "Chiwiiṭә", R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView view = findViewById(R.id.list);
        view.setAdapter(adapter);
    }
}

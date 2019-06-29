package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //This linearLayout is created to change background color when activity is created.
//        LinearLayout linearLayout = findViewById(R.id.list_view);
//        linearLayout.setBackgroundColor(getColor(R.color.category_phrases));

        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("Where are you going?", "Minto Wuksus"));
        words.add(new Word("What is your name?", "Tinnә Oyaase'nә"));
        words.add(new Word("My name is...", "Oyaaset..."));
        words.add(new Word("How are you feeling?", "Michәksәs?"));
        words.add(new Word("I’m feeling good.", "Kuchi Achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "Hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "Yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView view = findViewById(R.id.list);
        view.setAdapter(adapter);
    }
}

package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList containing the words.
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "Weṭeṭṭi", R.drawable.color_red));
        words.add(new Word("Green", "Chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "Țakaakki", R.drawable.color_brown));
        words.add(new Word("Gray", "Țopoppi", R.drawable.color_gray));
        words.add(new Word("Black", "Kululli", R.drawable.color_black));
        words.add(new Word("White", "Kelelli", R.drawable.color_white));
        words.add(new Word("Dusty Yellow", "Țopiisә", R.drawable.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "Chiwiiṭә", R.drawable.color_mustard_yellow));

        //Create a WordAdapter whose data source is a list of Words.
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        // Make the ListView use the WordAdapter created above, so that the
        // ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);
    }
}

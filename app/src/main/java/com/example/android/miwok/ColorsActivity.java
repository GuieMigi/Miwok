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
        words.add(new Word("Red", "Weṭeṭṭi"));
        words.add(new Word("Green", "Chokokki"));
        words.add(new Word("Brown", "Țakaakki"));
        words.add(new Word("Gray", "Țopoppi"));
        words.add(new Word("Black", "Kululli"));
        words.add(new Word("White", "Kelelli"));
        words.add(new Word("Dusty Yellow", "Țopiisә"));
        words.add(new Word("Mustard Yellow", "Chiwiiṭә"));

        //Create a WordAdapter whose data source is a list of Words.
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        // Make the ListView use the WordAdapter created above, so that the
        // ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);
    }
}

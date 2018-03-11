package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList containing the words.
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father", "әpә"));
        words.add(new Word("Mother", "әṭa"));
        words.add(new Word("Son", "Angsi"));
        words.add(new Word("Daughter", "Tune"));
        words.add(new Word("Older brother", "Taachi"));
        words.add(new Word("Younger brother", "Chalitti"));
        words.add(new Word("Older sister", "Teṭe"));
        words.add(new Word("Younger sister", "Kolliti"));
        words.add(new Word("Grandmother", "Ama"));
        words.add(new Word("Grandfather", "Paapa"));

        //Create a WordAdapter whose data source is a list of Words.
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        // Make the ListView use the WordAdapter created above, so that the
        // ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);
    }
}

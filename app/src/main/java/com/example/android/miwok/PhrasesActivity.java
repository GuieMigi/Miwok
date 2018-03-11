package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList containing the words.
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "Minto wuksus?"));
        words.add(new Word("What is your name?", "Tinnә oyaase'nә?"));
        words.add(new Word("My name is...", "Oyaaset..."));
        words.add(new Word("How are you feeling?", "Michәksәs?"));
        words.add(new Word("I’m feeling good.", "Kuchi achit."));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "Hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "Yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));

        //Create a WordAdapter whose data source is a list of words.
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        // Make the ListView use the WordAdapter created above, so that the
        // ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);
    }
}

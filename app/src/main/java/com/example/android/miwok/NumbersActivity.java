package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList containing the words.
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "Lutti"));
        words.add(new Word("Two", "Otiiko"));
        words.add(new Word("Three", "Tolookosu"));
        words.add(new Word("Four", "Oyyisa"));
        words.add(new Word("Five", "Massokka"));
        words.add(new Word("Six", "Temmokka"));
        words.add(new Word("Seven", "Kenekaku"));
        words.add(new Word("Eight", "Kawinta"));
        words.add(new Word("Nine", "Wo’e"));
        words.add(new Word("Ten", "Na’aacha"));

        //Create a WordAdapter whose data source is a list of Words.
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        // Make the ListView use the WordAdapter created above, so that the
        // ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);

        /**Instantiate the root LinearLayout.
        LinearLayout rootView = findViewById(R.id.rootView);

        For loop used to add all the words in the root LinearLayout.
        for (int index = 0; index < words.size(); index++){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
        }
        **/
    }
}

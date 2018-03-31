package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList containing the words.
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "Weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("Green", "Chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("Brown", "Țakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("Gray", "Țopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("Black", "Kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("White", "Kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("Dusty Yellow", "Țopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("Mustard Yellow", "Chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        //Create a WordAdapter whose data source is a list of Words.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        final ListView listView = findViewById(R.id.list);
        // Make the ListView use the WordAdapter created above, so that the
        // ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);

        //OnItemClickListener that plays the correct audio file when the listView item is clicked.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}

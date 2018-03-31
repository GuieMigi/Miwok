package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Create an ArrayList containing the words.
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "Minto wuksus?", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "Tinnә oyaase'nә?", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "Oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "Michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.", "Kuchi achit.", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.", "Hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.", "Yoowutis", R.raw.phrase_lets_go));
        words.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));

        //Create a WordAdapter whose data source is a list of words.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        final ListView listView = findViewById(R.id.list);
        // Make the ListView use the WordAdapter created above, so that the
        // ListView will display list items for each Word in the list.
        listView.setAdapter(adapter);

        //OnItemClickListener that plays the correct audio file when the listView item is clicked.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Word word = words.get(position);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
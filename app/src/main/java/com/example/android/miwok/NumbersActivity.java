package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();

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
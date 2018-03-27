package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Florin on 10.03.2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the Word object located at this position in the list.
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwokTextView.
        TextView miwokTextView = listItemView.findViewById(R.id.miwokTextView);

        // Get the miwokTranslation from the current Word object and
        // set this text on the miwokWord TextView.
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID defaultTextView
        TextView defaultTextView = listItemView.findViewById(R.id.defaultTextView);

        // Get the defaultTranslation from the current Word object and
        // set this text on the defaultWord TextView.
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageResource = listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            // Get the ImageResourceId from the current Word object and
            // set the corresponding drawable on the image ImageView.
            imageResource.setImageResource(currentWord.getImageResourceId());
            //Make sure the view is visible.
            imageResource.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView.
            imageResource.setVisibility(View.GONE);
        }

        /** Alternative way of checking if there is an image resource.
         if(currentWord.getImageResourceId() == 0){
         imageResource.setVisibility(View.GONE);
         }else {
         // Get the ImageResourceId from the current Word object and
         // set the corresponding drawable on the image ImageView.
         imageResource.setImageResource(currentWord.getImageResourceId());
         }
         */

        // Return the whole list item layout (containing 2 TextViews and one ImageView)
        // so that it can be shown in the ListView.
        return listItemView;
    }
}
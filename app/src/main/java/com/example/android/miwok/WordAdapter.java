package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColourResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colourResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColourResourceId = colourResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        /**
         * Get the {@link Word} object located at this position in the list
         */
        Word currentWord = getItem(position);

        // Check if the existing view is being reused, otherwise inflate the view
        // null is when a screen was first loaded (never cached)
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false); // Inflater translates XML files to actual view objects
        }

        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        // Get the miwok word from the current Word object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word);
        englishTextView.setText(currentWord.getDefaultTranslation());

        ImageView miwokImage = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            // Set the ImageView to the image resource specified in the current Word
            miwokImage.setImageResource(currentWord.getImgResourceId());
            miwokImage.setVisibility(View.VISIBLE);
        }

        else {
            // GONE = Image is hidden and doesn't take up any space on the View
            miwokImage.setVisibility(View.GONE);
        }

        // Set the theme colour for the list item
        View wordBackground = (LinearLayout) listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColourResourceId);
        // Set the background colour of the text container
        wordBackground.setBackgroundColor(color);

        return listItemView;
    }
}

/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        /** 2. Create a new object instance of the event listener (using the constructor) in MainActivity.java
         *  3. Attach the listener to the view in MainActivity.java */

        // Find the view that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a clicklistener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }
}

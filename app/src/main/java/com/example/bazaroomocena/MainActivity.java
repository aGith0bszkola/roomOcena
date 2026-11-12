package com.example.bazaroomocena;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

import java.util.List;

public class MainActivity extends AppCompatActivity {

static BouldersDatabase bouldersDatabase;
EditText nameTextView;
Button buttonAddBoulder, buttonFinishAddingBoulder;
Spinner  gradeSpinner, typeSpinner;
static ListView listViewBoulders;
static List<Boulder> boulderList;
ArrayAdapter<Boulder> arrayAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bouldersDatabase = Room.databaseBuilder(
                getApplicationContext(),BouldersDatabase.class,"boulder_db")
                .allowMainThreadQueries().build();

//        bouldersDatabase.get_boulderDAO().insert_boulder_to_db(
//                new Boulder("bourdern of dream",false,0,"crimp","v10",10)
//        );
        gradeSpinner = findViewById(R.id.Gradespinner);
        typeSpinner = findViewById(R.id.Typespinner);

        buttonAddBoulder = findViewById(R.id.addNewBoulder);
        buttonFinishAddingBoulder = findViewById(R.id.finishAddingNewBoulderButton);
        nameTextView = findViewById(R.id.Nametextview);

        listViewBoulders = findViewById(R.id.listViewBoulders);
        boulderList = bouldersDatabase.get_boulderDAO().select_all_from_boulders_db();
        arrayAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, boulderList);
        listViewBoulders.setAdapter(arrayAdapter);
        buttonAddBoulder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }

        });

    }
}

//sources:
//addBoulderButton:https://stackoverflow.com/questions/15991355/how-to-display-new-screen-when-a-button-is-clicked

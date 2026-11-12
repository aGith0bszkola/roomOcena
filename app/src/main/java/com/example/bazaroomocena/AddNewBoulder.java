package com.example.bazaroomocena;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class AddNewBoulder extends AppCompatActivity {
    BouldersDatabase bouldersDatabase;
    EditText newBoulderName;
    Spinner addNewBoulderSpinnerGrade, addNewBoulderSpinnerType;
    Button finishAddingBoulder;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

            bouldersDatabase = Room.databaseBuilder(
                            getApplicationContext(),BouldersDatabase.class,"boulder_db")
                    .allowMainThreadQueries().build();

            newBoulderName = findViewById(R.id.newBoulderName);
            addNewBoulderSpinnerGrade = findViewById(R.id.addNewBoulderSpinnerGrade);
            addNewBoulderSpinnerType = findViewById(R.id.addNewBoulderSpinnerType);
            finishAddingBoulder = findViewById(R.id.finishAddingNewBoulderButton);

    }


}

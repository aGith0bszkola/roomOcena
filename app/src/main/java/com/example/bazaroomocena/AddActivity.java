package com.example.bazaroomocena;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Database;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {
    BouldersDatabase bouldersDatabase;
    EditText newBoulderName;
    Spinner addNewBoulderSpinnerGrade, addNewBoulderSpinnerType;
    Button finishAddingBoulder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
            newBoulderName = findViewById(R.id.newBoulderName);
            addNewBoulderSpinnerGrade = findViewById(R.id.addNewBoulderSpinnerGrade);
            addNewBoulderSpinnerType = findViewById(R.id.addNewBoulderSpinnerType);
            finishAddingBoulder = findViewById(R.id.finishAddingNewBoulderButton);





            finishAddingBoulder.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Boulder boulder = new Boulder
                            (newBoulderName.getText().toString(),false,0,addNewBoulderSpinnerType.
                            getSelectedItem().toString(),addNewBoulderSpinnerGrade.getSelectedItem().toString());

                    MainActivity.bouldersDatabase.get_boulderDAO().insert_boulder_to_db(boulder);
                    MainActivity.boulderList.add(boulder);

                };
            });
    }



    }

package com.example.bazaroomocena;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {
BouldersDatabase bouldersDatabase;
TextView nameTextView;
Spinner  gradeSpinner, typeSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bouldersDatabase = Room.databaseBuilder(
                getApplicationContext(),BouldersDatabase.class,"boulder_db")
                .allowMainThreadQueries().build();

    }
}
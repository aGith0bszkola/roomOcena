package com.example.bazaroomocena;

import androidx.room.Entity;

@Entity(tableName = "boulders")
public class Boulder {
     public int ID;
    public String Grade;
    public String Type;
    public int Attempts = 0;
    public boolean isDone = false;
    public String Name;

    public Boulder(String grade, String type, int attempts, boolean isDone, String name) {
        Grade = grade;
        Type = type;
        Attempts = attempts;
        this.isDone = isDone;
        Name = name;
    }
}



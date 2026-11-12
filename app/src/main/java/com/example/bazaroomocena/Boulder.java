
package com.example.bazaroomocena;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "boulders")
public class Boulder {

    @PrimaryKey(autoGenerate = true)
    public int ID;

    public String Grade;
    public String Type;
    public int Attempts = 0;
    public boolean isDone = false;
    public String Name;

    public Boulder(String Name, boolean isDone, int Attempts, String Type, String Grade) {
        this.Name = Name;
        this.isDone = isDone;
        this.Attempts = Attempts;
        this.Type = Type;
        this.Grade = Grade;

    }


    @Override
    public String toString() {
        return "Boulder: " + Name + '\'' +

                "Grade:" + Grade + '\'' +
                "Type:" + Type + '\'' +
                " Attempts:" + Attempts +'\'' +
                "Done? " + isDone;


    }
}

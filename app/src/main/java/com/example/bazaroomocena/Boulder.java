package com.example.bazaroomocena;

public class Boulder {
String Grade;
String Type;
int Attempts = 0;
boolean isDone = false;
String Name;

    public Boulder(String grade, String type, int attempts, boolean isDone, String name) {
        Grade = grade;
        Type = type;
        Attempts = attempts;
        this.isDone = isDone;
        Name = name;
    }
}



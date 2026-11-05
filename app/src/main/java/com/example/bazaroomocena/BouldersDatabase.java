package com.example.bazaroomocena;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Boulder.class}, version = 1)
public abstract class BouldersDatabase extends RoomDatabase {
    public abstract Boulder_DAO get_boulderDAO();

}

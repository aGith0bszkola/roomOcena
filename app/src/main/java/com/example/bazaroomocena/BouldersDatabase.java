package com.example.bazaroomocena;

import androidx.room.Database;
@Database(entities = {Boulder.class}, version = 1)
public abstract class BouldersDatabase {
    public abstract Boulder_DAO get_boulderDAO();

}

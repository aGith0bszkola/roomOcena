package com.example.bazaroomocena;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface Boulder_DAO {
@Insert
    void insert_boulder_to_db(Boulder boulder);
@Insert
    void insert_boulder_list(Boulder ... boulders);
@Delete
    void delete_boulder(Boulder boulder);
@Update
    void update_boulder(Boulder boulder);

}

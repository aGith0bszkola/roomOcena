package com.example.bazaroomocena;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

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
@Query("SELECT * FROM BOULDERS")
    List<Boulder> select_all_from_boulders_db();
@Query("SELECT * FROM BOULDERS where Grade = :argument")
    List<Boulder> select_all_from_selectet_grade(String argument);
}

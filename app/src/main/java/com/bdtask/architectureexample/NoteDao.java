package com.bdtask.architectureexample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//Dao means Data access object
//Interface is an abstract class
//Dao deals with SQLite databases

@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note note);

    //@Query is used to create custom query
    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    @Query("SELECT * FROM note_table ORDER BY priority DESC")

    //LiveData observes table live. whenever data changes to db. It will update data to view.
    LiveData<List<Note>> getAllNotes();

}

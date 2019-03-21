package com.developeratin.mynote;

import com.developeratin.mynote.entity.Note;
import java.util.ArrayList;


public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}


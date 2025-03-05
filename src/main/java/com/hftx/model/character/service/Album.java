package com.hftx.model.character.service;
import java.util.ArrayList;

public class Album {
    private int id;
    private int userId;
    private ArrayList<Figure> figures;

    public Album(){
        this.figures = new ArrayList<Figure>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public ArrayList<Figure> getFigures() {
        return figures;
    }
    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }
}

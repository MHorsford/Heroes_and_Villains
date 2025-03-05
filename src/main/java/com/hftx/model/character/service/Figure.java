package com.hftx.model.character.service;

public class Figure {
    private String id;
    private Character character;

    public Figure(Character character) {
        this.character = character;
    }

    public String toString() {
        return "Personagem: " + character.toString() + "\n";
    }

}

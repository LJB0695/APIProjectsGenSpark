package org.example.Entity;

public class Animal {
    private int animalID;
    private String animalSpecies;

    private String color;

    public Animal(){}

    public int getAnimalID() {
        return animalID;
    }

    public void setAnimalID(int animalID) {
        this.animalID = animalID;
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalID=" + animalID +
                ", animalSpecies='" + animalSpecies + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

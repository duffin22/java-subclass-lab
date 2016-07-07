package com.hfad.javaanimal;

/**
 * Created by matthewtduffin on 06/07/16.
 */

public abstract class Animal {
    private String animalSpecies;
    private String animalID;
    private String animalCall;
    private String animalPicture;

    public Animal(String animalSpecies, String animalCall, String animalPicture) {
        this.animalSpecies=animalSpecies;
        this.animalID=newID(animalSpecies);
        this.animalCall=animalCall;
        this.animalPicture=animalPicture;
    }

    public String newID(String s) {
        if (s.length()>=2) {
            return s.substring(0, 2).toUpperCase() + ((int) (Math.random() * 10000));
        } else {
            return "ID"+((int) (Math.random() * 10000));
        }
    }

    //*******************************
    //** getter and setter methods **
    //*******************************

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public String getAnimalID() {
        return animalID;
    }

    public String getAnimalCall() {
        return animalCall;
    }

    public String getAnimalPicture() {
        return animalPicture;
    }
}


package com.hfad.javaanimal;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public abstract class Bird extends Animal {

    private int wingspan;

    public Bird(String animalSpecies,String animalCall, String animalPicture, int wingspan) {
        super(animalSpecies,animalCall,animalPicture);
        this.wingspan=wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

}

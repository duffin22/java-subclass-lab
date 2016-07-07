package com.hfad.javaanimal;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public abstract class Reptile extends Animal {
    private boolean isVenomous;

    public Reptile(String animalSpecies,String animalCall, String animalPicture,boolean isVenomous) {
        super(animalSpecies,animalCall,animalPicture);
        this.isVenomous=isVenomous;
    }

    public boolean isVenomous() {
        return isVenomous;
    }
}

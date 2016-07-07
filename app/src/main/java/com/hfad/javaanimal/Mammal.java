package com.hfad.javaanimal;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public abstract class Mammal extends Animal {

    private boolean isLandMammal;

    public Mammal(String animalSpecies,String animalCall, String animalPicture,boolean isLandMammal) {
        super(animalSpecies,animalCall,animalPicture);
        this.isLandMammal=isLandMammal;
    }

    public boolean isLandMammal() {
        return isLandMammal;
    }
}

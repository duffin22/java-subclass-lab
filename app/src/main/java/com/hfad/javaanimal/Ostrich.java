package com.hfad.javaanimal;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public class Ostrich extends Bird {

    public Ostrich() {
        super("Ostrich","Chirp! Chirp!","@drawable/ostrich",6);
    }

    public void buryHeadInSand() {
        System.out.println("The Ostrich buried its head!");
    }
}

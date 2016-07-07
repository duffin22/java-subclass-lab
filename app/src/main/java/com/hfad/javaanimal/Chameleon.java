package com.hfad.javaanimal;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public class Chameleon extends Reptile {

    public Chameleon() {
        super("Chameleon","*silently changes colour*","@drawable/chameleon",false);
    }

    public void eatFly() {
        System.out.println("The Chameleon ate a fly");
    }

    public int getDrawable() {
        return R.drawable.chameleon;
    }

}

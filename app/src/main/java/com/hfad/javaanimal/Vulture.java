package com.hfad.javaanimal;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public class Vulture extends Bird {

    public Vulture() {
        super("Vulture","Squuaaawwww","@drawable/vulture",7);
    }

    public void scavenge() {
        System.out.println("The Vulture scavenged your food!");
    }

}

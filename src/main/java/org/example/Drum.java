package org.example;

public class Drum extends Instrument {
    public Drum(String name){
        super(name);
    }
@Override
    public void sound() {
        System.out.println("Drums go boom");
    }
}

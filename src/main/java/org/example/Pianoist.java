package org.example;

public class Pianoist extends Musician {

    public Pianoist(String musicianName, Instrument instrument) {
        super(instrument, musicianName);
    }

    public void play() {
        System.out.println("Playing the piano doiiiiiiiiii!");
    }
}

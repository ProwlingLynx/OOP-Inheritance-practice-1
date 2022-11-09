package org.example;

public class Drummer extends Musician {

    public Drummer(String musicianName, Instrument instrument) {
        super(instrument, musicianName);
    }

    public void play() {
        System.out.println("Playing the drums yo!");
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Drum testDrum = new Drum("Drums");
        Piano testPiano = new Piano("cat");
        Drummer testDrummer = new Drummer("Emma", testDrum);
        Pianoist testPianoist = new Pianoist("Lioness", testPiano);

        testPiano.sound();
        testDrum.sound();
        testDrummer.play();
        testPianoist.play();
        // 1) Create a class "Drums" similar to the Piano class. Please connect Piano(child class) to Instrument(Parent) class
        // 2) Have its sound be "Drums go boom"
        // 3) Create a Drums object passing in the value "Drums".
        // 4) Create a drummer class.
        // 5) Create an drummer object that passes in the drums and the name "Emma".
        // 6) Create a play method in the Drummer class similar to the Pianist class
    }
}
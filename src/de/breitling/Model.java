package de.breitling;

public class Model {
    private int counter;

    public Model() {
        counter = 0;
    }
    public void increment() {
        this.counter++;
    }

    public int getCounter() {
        return counter;
    }
}

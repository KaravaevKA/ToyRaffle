package base;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Toy implements Comparable<Toy>{
    private int id;
    private String name;
    private int frequencyWeight;

    public Toy(int id, int frequencyWeight, String name) {
        this.id = id;
        this.name = name;
        this.frequencyWeight = frequencyWeight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequencyWeight() {
        return frequencyWeight;
    }

    public void setFrequencyWeight(int frequencyWeight) {
        this.frequencyWeight = frequencyWeight;
    }

    @Override
    public int compareTo(Toy other) {
        if (other == null) {
            return -1;
        }
        int delta = this.frequencyWeight - other.frequencyWeight;
        if (delta != 0) {
            return - delta;
        }
        return this.name.compareTo(other.name);
    }



    @Override
    public String toString() {
        return "id " + id +
                ", " + frequencyWeight + ", " + name;
    }
}

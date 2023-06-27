package base;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        ToysList list = new ToysList();
        list.addToyToList();
        list.printToyList();
        list.getPrize();
        try {
            list.saveToFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

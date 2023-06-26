package base;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class ToysList {
    PriorityQueue<Toy> list = new PriorityQueue<>();

    public Toy addSomeToy(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите название игрушки: ");
        String toyName = scanner.next();
        System.out.println("Введите номер игрушки: ");
        int toyID = scanner.nextInt();
        System.out.println("Игрушке присвоен номер: " + toyID);
        int frequency = random.nextInt(1,4);
        Toy newToy = new Toy(toyID,frequency,toyName);
        System.out.println(newToy);
        return newToy;
    }

    public void addToyToList(){
        list.add(addSomeToy());
    }

}


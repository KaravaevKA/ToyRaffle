package base;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class ToysList {
    PriorityQueue<Toy> list = new PriorityQueue<>();
    Toy prizeToy = null;

    public Toy addSomeToy(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите название игрушки: ");
        String toyName = scanner.next();
        System.out.println("Введите номер игрушки: ");
        int toyID = scanner.nextInt();
        System.out.println("Игрушке присвоен номер: " + toyID);
        int frequency = random.nextInt(1,4);
        Toy toy = new Toy(toyID,frequency,toyName);
        return toy;
    }

    public void addToyToList(){
        list.add(addSomeToy());
    }

    public void getPrize(){
        prizeToy = list.poll();
        System.out.println("Вы выиграли: " + prizeToy.getName());
    }
    public void printToyList(){
        for (Toy toy:list) {
            System.out.println(toy);
        }
    }
    public void saveToFile() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("Prizes.txt");
        StringBuilder output = new StringBuilder();
        output.append(list.peek());
        output.append(';');
        writer.println(output.toString());
    }
}


package base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToysList {
    PriorityQueue<Toy> list = new PriorityQueue<>();

    public ToysList() {
        this.list = list;
    }

    public void addSomeToy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название игрушки: ");
        String toyName = scanner.next();
        System.out.println("Введите номер игрушки: ");
        int toyID = scanner.nextInt();
        System.out.println("Игрушке присвоен номер: " + toyID);
        System.out.println("Укажите частоту выпадения игрушки (1-100): ");
        int frequency = scanner.nextInt();
        Toy toy = new Toy(toyID, frequency, toyName);
        list.add(toy);
    }
    public void getPrize() throws FileNotFoundException {
        File file = new File("Prizes.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            Toy prizeToy = null;
            prizeToy = list.poll();
            System.out.println("Поздравляем!! Вы выиграли: " + prizeToy.getName());
            writer.println("Ваш выигрыш: " + prizeToy.getName());
        }
    }

    public void printToyList() {
        for (Toy toy : list) {
            System.out.println(toy);
        }
    }

}


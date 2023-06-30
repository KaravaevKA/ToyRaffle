package base;

import java.util.Scanner;

public class Console {
    ToysList list = new ToysList();



    public Console() {
    }


    public void mainMenu() throws Exception {

        Scanner scanner = new Scanner(System.in);
        int command = 0;
        do{
            System.out.println("Выберите действие:\n" +
                    "0-Завершить работу, 1 - Добавить игрушку, 2 - Показать список игрушек, 3 - Провести розыгрыш: ");
            command = scanner.nextInt();
            selectCommands(command);
        }while(command!=0);
    }

    private void selectCommands(int command) throws Exception {
        switch (command) {
            case 1:
                list.addSomeToy();
                break;
            case 2:
                list.printToyList();
                break;
            case 3:
                list.getPrize();
                break;
        }
    }

}

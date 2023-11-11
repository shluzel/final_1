package views;

import controllers.Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PetView implements View {

    private final Controller controller;

    public PetView(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            println("*** Pets DATABASE ***");
            println("================================");
            println("0. Quit.");
            println("1. Add new Pet.");
            println("2. Read commands for pet.");
            println("3. Train new commands.");
            println("4. List of pets by birth date.");
            println("5. List of pets.");
            print("Please enter number from menu: ");
            try {
                int number = scanner.nextInt();
                switch (number) {
                    case 0 -> {
                        scanner.close();
                        controller.exit();
                    }
                    case 1 -> controller.addNewPet();
                    case 2 -> controller.getCommandsPet();
                    case 3 -> controller.addNewCommand();
                    case 4 -> controller.getPetsByBirthday();
                    case 5 -> controller.getAll();
                    default -> println("Please enter correct number.");
                }
            } catch (InputMismatchException e) {
                println("Incorrect number.");
                run();
            }
        }
    }

    @Override
    public void println(String string) {
        System.out.println(string);
    }

    @Override
    public void print(String string) {
        System.out.print(string);
    }

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public void scannerClose() {
        scanner.close();
    }
}

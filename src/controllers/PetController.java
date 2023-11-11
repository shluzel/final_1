package controllers;

import model.FieldAnimal;
import model.ParsDate;
import model.Registry;
import views.View;

import java.util.HashMap;

public class PetController implements Controller {
    private final Registry registry;
    private View view;
    public PetController(Registry registry) {
        this.registry = registry;
    }

    public void addNewPet() {
        HashMap<Enum<FieldAnimal>, String> data = new HashMap<>();
        view.print("Enter your type of animal (dog, cat, hamster): ");
        String type = view.getString();
        if ((type.equals("dog")) || (type.equals("cat")) || (type.equals("hamster"))) {
            data.put(FieldAnimal.TYPE, type);
        } else {
            view.println("There's no such type.");
            return;
        }

        view.print("Enter name for your animal: ");
        data.put(FieldAnimal.NAME, view.getString());
        view.print("Enter it's birth date (yyyy-mm-dd): ");
        String date = view.getString();
        if (ParsDate.checkDate(date)) {
            data.put(FieldAnimal.BIRTHDATE, date);
        } 
        else {
            view.println("Incorrect date.");
            return;
        }
        view.print("Enter new command/s (using ','): ");
        data.put(FieldAnimal.COMMAND, view.getString());
        view.println(registry.addNewPet(data));
    }

    public void getCommandsPet() {
        view.println("Animals: " + registry.getAllName());
        view.print("Enter name for your animal: ");
        view.println(registry.getCommandsPet(view.getString()));
    }

    public void addNewCommand() {
        HashMap<Enum<FieldAnimal>, String> data = new HashMap<>();
        view.println("Animals: " + registry.getAllName());
        view.print("Enter name for your animal: ");
        data.put(FieldAnimal.NAME, view.getString());
        view.print("Enter new command/s (using ','): ");
        data.put(FieldAnimal.COMMAND, view.getString());
        view.println(registry.addNewCommand(data));
    }

    public void getPetsByBirthday() {
        view.print("Enter data (yyyy-mm-dd): ");
        view.println(registry.getPetsByBirthday(view.getString()));
    }

    public void getAll() {
        view.println(registry.getAll());
    }

    public void exit() {
        view.println("Quit.");
        view.scannerClose();
        System.exit(1);
    }

    public void setView(View view) {
        this.view = view;
    }
}

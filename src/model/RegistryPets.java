package model;

import model.animals.Pet;
import repository.Database;

import java.util.Collection;
import java.util.HashMap;

public class RegistryPets implements Registry {

    private final Database database;

    public RegistryPets(Database database) {
        this.database = database;
    }

    public String addNewPet(HashMap<Enum<FieldAnimal>, String> data) {
        if (data.get(FieldAnimal.NAME) == null || data.get(FieldAnimal.NAME).isEmpty()) {
            return "You forgot to enter name.";
        }
        if (ParsDate.checkDate(data.get(FieldAnimal.BIRTHDATE))) {
            database.addNewAnimal(new PetsFactory().detAnimal(data));
            return "New pet added.";
        } 
        else {
            return "Incorrect date of birth.";
        }
    }

    public String getCommandsPet(String namePet) {
        String result = "";
        if (namePet == null || namePet.isEmpty()) {
            return  "You forgot to enter name.";
        } 
        else {
            for (Pet p : database.getAll()) {
                if (p.getName().equals(namePet)) {
                    result = "Commands " + namePet +
                            " " + database.getCommandsPet(namePet).toString();
                }
            }
            if (result.isEmpty()){
                return "Can't find pet with such name.";
            }
            else {
                return result;
            }
        }
    }

    public String addNewCommand(HashMap<Enum<FieldAnimal>, String> newCommands) {
        String result = "";
        String name = newCommands.get(FieldAnimal.NAME);
        String commands = newCommands.get(FieldAnimal.COMMAND);
        if (name == null || name.isEmpty()) {
            return "You forgot to enter name.";
        } 
        else if (commands == null || commands.isEmpty()) {
            return "You forgot to enter command.";
        } 
        else {
            for (Pet p : database.getAll()) {
                if (p.getName().equals(name)) {
                    database.addNewCommand(newCommands);
                    result = getCommandsPet(name);
                }
            }
        }
        if (result.isEmpty()){
            return "Can't find pet with such name.";
        }
        else {
            return result;
        }
    }

    public String getPetsByBirthday(String birthday) {
        Collection<Pet> temp = null;
        StringBuilder result= new StringBuilder();
        if (ParsDate.checkDate(birthday)) {
            for (Pet p : database.getAll()) {
                if (p.getBirthDate().equals(birthday)) {
                    temp = database.getPetsByBirthday(birthday);
                }
            }
        } 
        else {
            return  "Incorrect date of birth.";
        }
        if (temp ==null){
            return "Can't find pet with such date of birth.";
        }
        else {
            for (Pet p : temp) {
                result.append(p).append("\n");
            }
        }
        return result.toString();
    }

    public String getAll() {
        StringBuilder result = new StringBuilder();
        for (Pet p : database.getAll()) {
            result.append(p)
                    .append("\n");
        }
        if (result.isEmpty()) {
            return "No data.";
        } 
        else {
            return result.toString();
        }
    }
    public String getAllName(){
        StringBuilder result = new StringBuilder();
        for (Pet p : database.getAll()) {
            result.append(p.getName())
                    .append(" ");
        }
        return result.toString();
    }  
}

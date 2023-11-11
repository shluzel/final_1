package model.animals;

import java.util.*;

public class Animal {
    private static int count = 0;
    private final int id = ++count;

    private final String name;
    private String birthDate;
    private final Collection<String> commands = new ArrayList<>();

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void addCommands(Collection<String> newCommands) {
        commands.addAll(newCommands);
    }

    public Collection<String> getCommands() {
        return commands;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String[] temp = getClass().toString().split("\\.");
        String srtClass = temp[temp.length - 1];
        return "ID " + getId() + ", " + getName() + "(" + srtClass + ")" +
                ", birthday - " + getBirthDate() +
                ", commands - " + getCommands();
    }
}

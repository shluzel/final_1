package repository;

import model.CollectionsCommands;
import model.FieldAnimal;
import model.PetsFactory;
import model.animals.Pet;

import java.util.*;

public class PetsDatabase implements Database {

    private final Collection<Pet> petCollection = new ArrayList<>();

    public PetsDatabase() {
        setPetsAnimalCollection();
    }

    public void addNewAnimal(Pet pet) {
        petCollection.add(pet);
    }

    public Collection<String> getCommandsPet(String name) {
        Collection<String> temp = null;
        for (Pet p : petCollection) {
            if (p.getName().equals(name)) {
                temp = p.getCommands();
            }
        }
        return temp;
    }

    public void addNewCommand(HashMap<Enum<FieldAnimal>, String> newCommands) {
        for (Pet p : petCollection) {
            if (p.getName().equals(newCommands.get(FieldAnimal.NAME))) {
                p.addCommands(CollectionsCommands.getCollections(newCommands.get(FieldAnimal.COMMAND)));
            }
        }
    }
 
        public Collection<Pet> getPetsByBirthday (String birthday){
            Collection<Pet> temp = new ArrayList<>();
            for (Pet p : petCollection) {
                if (p.getBirthDate().equals(birthday))
                    temp.add(p);
                }
            return temp;
        }

        public Collection<Pet> getAll () {
            return petCollection;
        }

        private void setPetsAnimalCollection () {
            PetsFactory factory = new PetsFactory();

            HashMap<Enum<FieldAnimal>, String> sparkle = new HashMap<>();
            sparkle.put(FieldAnimal.TYPE, "dog");
            sparkle.put(FieldAnimal.NAME, "Sparkle");
            sparkle.put(FieldAnimal.BIRTHDATE, "2021-02-06");
            sparkle.put(FieldAnimal.COMMAND, "Sit, Bark");
            petCollection.add(factory.detAnimal(sparkle));

            HashMap<Enum<FieldAnimal>, String> donna = new HashMap<>();
            donna.put(FieldAnimal.TYPE, "dog");
            donna.put(FieldAnimal.NAME, "Donna");
            donna.put(FieldAnimal.BIRTHDATE, "2023-02-11");
            donna.put(FieldAnimal.COMMAND, "Sit, Roll");
            petCollection.add(factory.detAnimal(donna));

            HashMap<Enum<FieldAnimal>, String> blackie = new HashMap<>();
            blackie.put(FieldAnimal.TYPE, "cat");
            blackie.put(FieldAnimal.NAME, "Blackie");
            blackie.put(FieldAnimal.BIRTHDATE, "2018-10-10");
            blackie.put(FieldAnimal.COMMAND, "Sit, Meow");
            petCollection.add(factory.detAnimal(blackie));

            HashMap<Enum<FieldAnimal>, String> garfie = new HashMap<>();
            garfie.put(FieldAnimal.TYPE, "cat");
            garfie.put(FieldAnimal.NAME, "Garfie");
            garfie.put(FieldAnimal.BIRTHDATE, "2010-05-20");
            garfie.put(FieldAnimal.COMMAND, "Scratch, Jump");
            petCollection.add(factory.detAnimal(garfie));

            HashMap<Enum<FieldAnimal>, String> brick = new HashMap<>();
            brick.put(FieldAnimal.TYPE, "hamster");
            brick.put(FieldAnimal.NAME, "Brick");
            brick.put(FieldAnimal.BIRTHDATE, "2022-01-21");
            brick.put(FieldAnimal.COMMAND, "Hide, Eat");
            petCollection.add(factory.detAnimal(brick));

            HashMap<Enum<FieldAnimal>, String> crunchy = new HashMap<>();
            crunchy.put(FieldAnimal.TYPE, "hamster");
            crunchy.put(FieldAnimal.NAME, "Crunchy");
            crunchy.put(FieldAnimal.BIRTHDATE, "2022-04-03");
            crunchy.put(FieldAnimal.COMMAND, "Roll, Lay");
            petCollection.add(factory.detAnimal(crunchy));

        }  
}

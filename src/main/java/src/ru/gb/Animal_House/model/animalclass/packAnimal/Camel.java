package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import src.ru.gb.Animal_House.model.Animal;

import java.time.LocalDate;

public class Camel extends Animal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getAnimalClass() {
        return "Pack";
    }
}

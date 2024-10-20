package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import src.ru.gb.Animal_House.model.Animal;

import java.time.LocalDate;

public class Horse extends Animal {
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getAnimalClass() {
        return "Pack";
    }
}

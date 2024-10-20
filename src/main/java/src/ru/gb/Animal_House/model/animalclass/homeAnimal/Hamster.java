package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import src.ru.gb.Animal_House.model.Animal;

import java.time.LocalDate;

public class Hamster extends Animal {
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getAnimalClass() {
        return "House";
    }
}

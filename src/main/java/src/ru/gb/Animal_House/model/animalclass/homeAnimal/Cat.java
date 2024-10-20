package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import src.ru.gb.Animal_House.model.Animal;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getAnimalClass() {
        return "House";
    }
}

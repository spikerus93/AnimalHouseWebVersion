package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.animalclass.AnimalClass;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public AnimalClass getAnimalClass() {
        return AnimalClass.valueOf("House");
    }
}

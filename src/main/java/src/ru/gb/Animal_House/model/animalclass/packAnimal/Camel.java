package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.animalclass.AnimalClass;

import java.time.LocalDate;

public class Camel extends Animal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public AnimalClass getAnimalClass() {
        return AnimalClass.valueOf("Pack");
    }
}

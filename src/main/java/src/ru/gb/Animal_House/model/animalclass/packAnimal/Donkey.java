package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.animalclass.AnimalClass;

import java.time.LocalDate;

public class Donkey extends Animal {
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);

    }

    @Override
    public AnimalClass getAnimalClass() {
        return AnimalClass.valueOf("Pack");
    }
}

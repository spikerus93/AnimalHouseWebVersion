package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import src.ru.gb.Animal_House.model.Animal;

import java.time.LocalDate;

public class PackAnimal extends Animal {
    public PackAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass = ("Вьючное животное, Семейство: ");
    }
}

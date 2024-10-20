package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import src.ru.gb.Animal_House.model.Animal;

import java.time.LocalDate;

public abstract class HomeAnimal extends Animal {
    public HomeAnimal(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass = ("Домашнее животное, Семейство: ");
    }
}

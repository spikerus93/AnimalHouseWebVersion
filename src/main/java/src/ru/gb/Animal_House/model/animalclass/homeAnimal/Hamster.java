package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import java.time.LocalDate;

public class Hamster extends HomeAnimal{
    public Hamster(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass += "Хомяк";
    }
}

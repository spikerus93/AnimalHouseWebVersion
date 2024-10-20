package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import java.time.LocalDate;

public class Cat extends HomeAnimal{
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getAnimalClass() {
        return "House";
    }
}

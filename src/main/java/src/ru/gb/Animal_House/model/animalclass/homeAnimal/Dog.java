package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import java.time.LocalDate;

public class Dog extends HomeAnimal{
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getAnimalClass() {
        return "House";
    }
}

package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import java.time.LocalDate;

public class Camel extends PackAnimal{
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String getAnimalClass() {
        return "Pack";
    }
}

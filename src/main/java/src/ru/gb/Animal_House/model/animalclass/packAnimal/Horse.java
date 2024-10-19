package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass += "Лошадь";
    }
}

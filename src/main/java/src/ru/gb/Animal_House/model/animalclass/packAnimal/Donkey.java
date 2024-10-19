package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public Donkey(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.animalClass += "Осёл";
    }
}

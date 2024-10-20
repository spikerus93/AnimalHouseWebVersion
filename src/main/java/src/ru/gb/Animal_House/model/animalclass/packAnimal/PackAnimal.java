package src.ru.gb.Animal_House.model.animalclass.packAnimal;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public abstract class PackAnimal{
    protected  String name;
    protected LocalDate birthDate;

    public PackAnimal(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public abstract String getAnimalClass();
}

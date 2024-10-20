package src.ru.gb.Animal_House.model.animalclass.homeAnimal;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public abstract class HomeAnimal{
    protected String name;
    protected LocalDate birthDate;

    public HomeAnimal(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public abstract String getAnimalClass();
}

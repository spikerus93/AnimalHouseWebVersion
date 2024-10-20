package src.ru.gb.Animal_House.model.service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Data

public class AnimalRequest {
    private String name;
    private LocalDate birthDate;

    private String animalClass;
    private List<String> commands;

    @Override
    public String toString() {
        return "AnimalRequest{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", animalClass='" + animalClass + '\'' +
                ", commands=" + commands +
                '}';
    }
}


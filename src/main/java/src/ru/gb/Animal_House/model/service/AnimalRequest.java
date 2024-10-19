package src.ru.gb.Animal_House.model.service;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
public class AnimalRequest {
    private String name;
    private LocalDate birthDate;
    private String animalType;
    private List<String> commands;

}


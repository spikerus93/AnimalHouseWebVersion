package src.ru.gb.Animal_House.model.service;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class TrainAnimalRequest{

    private List<String> commands;
}

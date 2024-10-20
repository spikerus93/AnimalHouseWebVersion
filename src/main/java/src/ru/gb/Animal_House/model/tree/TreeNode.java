package src.ru.gb.Animal_House.model.tree;

import lombok.NonNull;
import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.animalclass.AnimalClass;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TreeNode <E> {
    @NonNull
    Optional<Animal> findById(@NonNull Long id);
    @NonNull
    List<Animal> findAll();
    List<Animal> findByName(String name);
    List<Animal> findByBirthDate(LocalDate birthDate);

    void setAnimalId(long id);
    long getAnimalId();
    String getName();
    LocalDate getBirthDate();
    String getCommands();
    AnimalClass getAnimalClass();
}

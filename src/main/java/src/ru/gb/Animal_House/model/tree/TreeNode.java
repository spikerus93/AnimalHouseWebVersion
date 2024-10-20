package src.ru.gb.Animal_House.model.tree;

import org.springframework.data.jpa.repository.JpaRepository;
import src.ru.gb.Animal_House.model.Animal;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TreeNode <E> extends Serializable, JpaRepository<Animal, Long> {
    Optional<Animal> findById(Long id);
    List<Animal> findAll();
    List<Animal> findByName(String name);
    List<Animal> findByBirthDate(LocalDate birthDate);

    void setAnimalId(long id);
    long getAnimalId();
    String getName();
    LocalDate getBirthDate();
    List<E>getAnimals();
    String getCommands();
    String getAnimalClass();
}

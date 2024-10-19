package src.ru.gb.Animal_House.repo;

import org.springframework.data.repository.CrudRepository;
import src.ru.gb.Animal_House.model.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalRepository extends CrudRepository {
    Optional<Animal> findById(Long id);
    List<Animal> findAll(Animal animal);
}

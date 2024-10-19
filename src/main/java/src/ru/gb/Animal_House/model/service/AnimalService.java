package src.ru.gb.Animal_House.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.repo.AnimalRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public void addAnimal(AddAnimalRequest request){
    Animal animal = new Animal((request.getName(), request.getDateOfBirth(), request.getAnimalClass(), request.getCommands());
    animalRepository.save(animal);
    }
    public void trainAnimal(long id, List<String>commands){
        Optional<Animal> animalOptional = animalRepository.findById(id);
        if(animalOptional.isPresent()){
            Animal animal = animalOptional.get();
            animal.setCommands(commands);
            animalRepository.save(animal);
        }
        else {
            throw new NoSuchElementException("Animal not found with this id");
        }
    }
    public Optional<Animal> getAnimalById(long id){
        return animalRepository.findById(id);
    }
    public List<Animal> getAllAnimals(){

    }
}

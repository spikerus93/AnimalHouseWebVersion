package src.ru.gb.Animal_House.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.AnimalBuilder;
import src.ru.gb.Animal_House.model.tree.AnimalTree;
import src.ru.gb.Animal_House.repo.AnimalRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    private AnimalTree<Animal> animalTree;
    private final AnimalBuilder animalBuilder;

    public AnimalService() {
        animalTree = new AnimalTree<>();
        animalBuilder = new AnimalBuilder();
    }

    public void addAnimal(AddAnimalRequest request){
    Animal animal = new Animal((request.getName(),
            request.getBirthDate(),
            request.getAnimalClass(),
            request.getCommands());
    animalRepository.save(animal);
    }
    public void trainAnimal(long id, List<String>commands){
        Optional<Animal> animalOptional = animalRepository.findById(id);
        if(animalOptional.isPresent()){
            Animal animal = animalOptional.get();
            animal.setCommands(String.valueOf(commands));
            animalRepository.save(animal);
        }
        else {
            throw new NoSuchElementException("Animal not found with this id");
        }
    }
    public Optional<Animal> getAnimalById(long id){
        return animalRepository.findById(id);
    }
    public List<Animal> getAllAnimals(long animalId){
        return animalRepository.findAll(animalId);
    }
    public void deleteAnimal(long id){
        animalRepository.deleteById(id);
    }
    public List<String> getCommands(long id){
        Optional<Animal> animalOptional = animalRepository.findById(id);
        if(animalOptional.isPresent()){
            return Collections.singletonList(animalOptional.get().getCommands());
        } else {
            throw  new NoSuchElementException("Animal not found with this ID");
        }
    }
    public int countAnimals(long animalId){
        return Math.toIntExact(animalRepository.count());
    }
    public List<Animal> sortAnimalsByName(){
        return animalRepository.findAll().forEach().sorted(Comparator.comparing(Animal::getBirthDate).reversed()).collect(Collectors.toList());
    }
}

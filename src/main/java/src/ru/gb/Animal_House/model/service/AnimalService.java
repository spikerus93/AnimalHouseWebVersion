package src.ru.gb.Animal_House.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.AnimalBuilder;
import src.ru.gb.Animal_House.model.tree.AnimalTree;
import src.ru.gb.Animal_House.model.tree.TreeNode;

import java.util.*;

@Service
public class AnimalService {
    @Qualifier("treeNode")
    @Autowired
    private TreeNode root;

    private AnimalTree<Animal> animalTree;
    private AnimalBuilder animalBuilder;

    public AnimalService() {
        animalTree = new AnimalTree<>();
        animalBuilder = new AnimalBuilder();
    }

    public Animal addAnimal(Animal animal) {
        root.save(animal);
        return animal;
    }

    public Animal updateAnimal(Long id, Animal animal) {
        animal.setAnimalId(id);
        root.save(animal);
        return animal;
    }

    public void trainAnimal(long id, List<String> commands) {
        Optional<Animal> animalOptional = Optional.ofNullable(animalTree.getById(id));
        if (animalOptional.isPresent()) {
            Animal animal = animalOptional.get();
            animal.setCommands(commands);
            root.save(animal);
        } else {
            throw new NoSuchElementException("Animal not found with this id");
        }
    }

    public long getAnimalById(Long id) {
        return (long) root.findById(id).orElseThrow();
    }

    public List<Animal> getAllAnimals() {
        return root.getAnimals();
    }

    public void deleteAnimal(long id) {
        root.delete(id);
    }

    public void addCommand(Long id, String command) {
        Animal animal = animalTree.getById(id);
        animal.setCommands(Arrays.asList(command.split(" ")));
        updateAnimal(id, animal);
    }

    public String seeCommands(Long id) {
        return animalTree.getById(id).getCommands();
    }

    public List<String> getCommands(Long id) {
        Optional<Animal> animalOptional = Optional.ofNullable(animalTree.getById(id));
        if (animalOptional.isPresent()) {
            return Collections.singletonList(animalOptional.get().getCommands());
        } else {
            throw  new NoSuchElementException("Animal not found with this ID");
        }
    }

    public int countAnimals() {
        return root.getAnimals().size();
    }

    public List<Animal> sortAnimalsByName() {
        return animalTree.sortAnimalsByName();
    }

    public void saveAnimals() {

    }

    public List<Animal> sortByBirthDate() {
        animalTree.sortByBirthDate();
        return null;
    }
    public void sortByName() {
        animalTree.sortByNName();
    }

    public void loadAnimals() {
        root.getAnimals().clear();
    }

    public String getAnimals() {
        return getAllAnimals().toString();
    }
    public boolean checkId(Long id) {
        return animalTree.checkId(id);
    }

    public String getAnimalsTree() {
        return animalTree.getInfo();
    }

    public String getInfoById(Long id){
        return animalTree.getInfoById(id);
    }
}

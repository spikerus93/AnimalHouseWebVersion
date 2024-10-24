package src.ru.gb.Animal_House.model.tree;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.stereotype.Repository;
import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.tree.comparators.AnimalComparatorByBirthDate;
import src.ru.gb.Animal_House.model.tree.comparators.AnimalComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class AnimalTree <E extends TreeNode<E>> implements Serializable, Iterable<E>{
    @Getter
    @Setter
    private long animalId = 1;
    @Getter
    @Setter
    private int counter = 0;
    private List<E> animalList;
    public AnimalTree() {
        animalList = new ArrayList<>();
    }


    public void add(E animal) {
        if(!animalList.contains(animal)) {
            animalList.add(animal);
            animal.setAnimalId(animalId);
            counter++;
        }
    }

    public boolean checkId(long id) {
        return id < animalId && id >= 0;
    }

    public E getById(long animalId) {
        if(checkId(animalId)) {
            for(E animal : animalList) {
                if(animal.getAnimalId() == animalId) {
                    return animal;
                }
            }
        }
        return null;
    }

    public String seeCommands(long animalId) {
        StringBuilder commands = new StringBuilder();
        commands.append("id: ").append(animalId).append("\n");
        E animal = getById(animalId);
        if(animal != null) {
            commands.append("Кличка: ").append(animal.getName()).append("\n");
            commands.append("Тип: ").append(animal.getAnimalClass()).append("\n");
            commands.append("Команды: ").append(animal.getCommands()).append("\n");
            return commands.toString();
        }
        return "Данные отсутствуют.";
    }

    public void remove(long animalId) {
        if(checkId(animalId)) {
            E animal = getById(animalId);
            animalList.remove(animal);
            counter--;
        }
    }

    public void sortByNName(){
        animalList.sort(new AnimalComparatorByName<>());
    }

    public void sortByBirthDate(){
        animalList.sort(new AnimalComparatorByBirthDate<>());
    }

    public String getAnimalList(){
        StringBuilder animals = new StringBuilder();
        for(E animal : animalList) {
            animals.append(animal);
        }
        return animals.toString();
    }

    public String getInfo(){
        StringBuilder animals = new StringBuilder();
        animals.append("В питомнике: ");
        animals.append(animalList.size());
        animals.append(" животных \n");
        for(E animal : animalList) {
            animals.append(animal);
            animals.append("\n");
        }
        return animals.toString();
    }

    public String getInfoById(long animalId){
        StringBuilder animals = new StringBuilder("ID - ");
        animals.append(animalId).append("\n").append("\n");
        E animal = getById(animalId);
        if(animal != null) {
            animals.append("Тип: ");
            animals.append(animal.getAnimalClass()).append("\n");
            animals.append("Кличка: ");
            animals.append(animal.getName()).append("\n");
            animals.append("Дата рождения: ");
            animals.append(animal.getBirthDate()).append("\n");
        }
        if(animal.getCommands() != null) {
            animals.append(animal.getCommands()).append("\n");
            return animals.toString();
        }
        return "Данных нет.";
    }

    @Override
    public String toString() {
        return getInfo();
    }

    @Override
    @NonNull
    public Iterator<E> iterator() {
        return new AnimalIterator<E>(animalList);
    }
}

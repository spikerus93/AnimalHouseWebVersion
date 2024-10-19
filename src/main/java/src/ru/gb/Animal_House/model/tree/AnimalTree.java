package src.ru.gb.Animal_House.model.tree;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    @Override
    @NonNull
    public Iterator<E> iterator() {
        return new AnimalIterator<E>(animalList);
    }
}

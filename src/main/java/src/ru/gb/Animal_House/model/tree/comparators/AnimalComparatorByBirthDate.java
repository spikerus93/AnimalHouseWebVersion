package src.ru.gb.Animal_House.model.tree.comparators;

import src.ru.gb.Animal_House.model.tree.TreeNode;

import java.util.Comparator;

public class AnimalComparatorByBirthDate <E extends TreeNode<E>> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return (o1.getBirthDate().compareTo(o2.getBirthDate()));
    }
}

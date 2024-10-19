package src.ru.gb.Animal_House.model;
import java.time.LocalDate;
import src.ru.gb.Animal_House.model.animalclass.homeAnimal.Cat;
import src.ru.gb.Animal_House.model.animalclass.homeAnimal.Dog;
import src.ru.gb.Animal_House.model.animalclass.homeAnimal.Hamster;
import src.ru.gb.Animal_House.model.animalclass.packAnimal.Camel;
import src.ru.gb.Animal_House.model.animalclass.packAnimal.Donkey;
import src.ru.gb.Animal_House.model.animalclass.packAnimal.Horse;

public class AnimalBuilder extends Animal{
        private static final int DOG = 1;
        private static final int CAT = 2;
        private static final int HAMSTER = 3;
        private static final int HORSE = 4;
        private static final int CAMEL = 5;
        private static final int DONKEY = 6;

        private AnimalBuilder() {}

        public static Animal createAnimal(int animalClass, String name, LocalDate birthDate) {
            return switch (animalClass) {
                case DOG -> new Dog(name, birthDate);
                case CAT -> new Cat(name, birthDate);
                case HAMSTER -> new Hamster(name, birthDate);
                case HORSE -> new Horse(name, birthDate);
                case CAMEL -> new Camel(name, birthDate);
                case DONKEY -> new Donkey(name, birthDate);
                default -> throw new IllegalArgumentException("Unknown animal class: " + animalClass);
            };
        }
}

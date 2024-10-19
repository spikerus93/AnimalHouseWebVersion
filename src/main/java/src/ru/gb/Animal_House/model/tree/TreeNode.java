package src.ru.gb.Animal_House.model.tree;

import java.io.Serializable;
import java.time.LocalDate;

public interface TreeNode <E> extends Serializable {
    void setAnimalId(long id);
    long getAnimalId();
    String getName();
    LocalDate getBirthDate();
    String getCommands();
    String getAnimalClass();
}

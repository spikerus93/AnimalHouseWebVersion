package src.ru.gb.Animal_House.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @lombok.Setter
    @ToString.Exclude
    public String animalClass;

    @Setter
    @Getter
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate birthDate;

    @ElementCollection
    private List<String> commands;

    public Animal(){};

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.animalClass = "Животное";
        this.commands = new ArrayList<>();
    }

    public void setCommands(String command) {
        this.commands.add(command);
    }

    public String getCommands() {
        if (!(this.commands).isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.commands);
            return sb.toString();
        }
        return null;
    }

    public void setId (int id) {
        this.id = (long) id;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", тип: " + animalClass + ", кличка: "
                + name + ", дата рождения: " + birthDate + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Animal animal)){
            return false;
        }
        return animal.getId() == getId();
    }
}

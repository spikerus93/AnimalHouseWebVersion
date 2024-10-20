package src.ru.gb.Animal_House.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.security.core.userdetails.User;
import src.ru.gb.Animal_House.model.tree.TreeNode;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table(name = "animals")
@AllArgsConstructor

public class Animal implements TreeNode<Animal> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Getter
    @lombok.Setter
    @ToString.Exclude
    public String animalClass;

    @Column(nullable = false)
    @Setter
    @Getter
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate birthDate;

    @ElementCollection
    private List<String> commands;

    public Animal() {}

    public Animal(String name, LocalDate birthDate, String animalClass) {
        this.name = name;
        this.birthDate = birthDate;
        this.animalClass = "Животное";
        this.commands = new ArrayList<>();
    }

    @NonNull
    @JoinColumn(name = "user_id")
    private User user;

    public Animal(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setCommands(List<String> command) {
        this.commands.clear();
        this.commands.addAll(command);
    }

    public Optional<Animal> findById(Long id) {
        return Optional.empty();
    }

    public List<Animal> findAll() {
        return List.of();
    }

    public List<Animal> findByName(String name) {
        return List.of();
    }

    public List<Animal> findByBirthDate(LocalDate birthDate) {
        return List.of();
    }

    public void setAnimalId(long id) {

    }

    public long getAnimalId() {
        return 0;
    }

    public List<Animal> getAnimals() {
        return List.of();
    }

    public String getCommands() {
        if (!(this.commands).isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.commands);
            return sb.toString();
        }
        return null;
    }

    public void setId (Long id) {
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

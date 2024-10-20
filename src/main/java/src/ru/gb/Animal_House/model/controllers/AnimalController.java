package src.ru.gb.Animal_House.model.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.ru.gb.Animal_House.model.Animal;
import src.ru.gb.Animal_House.model.service.AnimalService;
import src.ru.gb.Animal_House.model.service.TrainAnimalRequest;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;
    @Setter
    @Getter

    private Animal animal;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Animal House";
    }

    @PostMapping("/animals/add")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable Long id, @RequestBody Animal animal) {
        animal.setId(id);
        return animalService.updateAnimal(id, animal);
    }

    @PutMapping("animals/{id}/train")
    public ResponseEntity<Void> trainAnimal(@PathVariable ("id") long id, @RequestBody TrainAnimalRequest request) {
        animalService.trainAnimal(id,request.getCommands());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/animals/{id}/")
    public String getAnimalById(@PathVariable ("id") long id) {
        return animalService.getAnimalById(id);
    }
    @GetMapping("/animals/list")
    public ResponseEntity<String> listAnimals(@RequestParam(value = "AnimalList", required = false) String animalList) {
        String animals = animalService.getAllAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @DeleteMapping("/animals/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable("id") long id) {
        animalService.deleteAnimal(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/animals/commands/{id}")
    public ResponseEntity<List<String>> getCommandsById(@PathVariable("id") long id) {
        List<String> commands = animalService.getCommands(id);
        return new ResponseEntity<>(commands, HttpStatus.OK);
    }

    @GetMapping("/animals/count")
    public ResponseEntity<Integer> countAnimals() {
        Integer count = animalService.countAnimals();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/animals/generalinfo")
    public ResponseEntity<String> generalInfo() {
        String animals = animalService.getAllAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/animals/sorted/name")
    public ResponseEntity<Void> sortedByName() {
        animalService.sortAnimalsByName();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/animals/sorted/birthdate")
    public ResponseEntity<List<Animal>> sortedByBirthDate() {
        List<Animal> animals = animalService.sortByBirthDate();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/animals/save")
    public ResponseEntity<Void> saveAnimals() {
        animalService.saveAnimals();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/animals/load")
    public ResponseEntity<Void> loadAnimals() {
        animalService.loadAnimals();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/animals/getDataById")
    public String getDataById(@RequestParam(value = "AnimalId") long animalId) {
        return animalService.getInfoById(animalId);
    }

    @GetMapping("/animals/showInfoByAnimals")
    public String showInfoByAnimals(@RequestParam(value = "AnimalList", required = false) String animalList) {
        return animalService.getAnimalsTree();
    }
}

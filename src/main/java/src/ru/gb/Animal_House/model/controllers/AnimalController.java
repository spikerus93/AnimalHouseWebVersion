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


    @PostMapping("/addNewAnimal.js")
    public Animal addAnimal(@RequestBody Animal animal) {
        return animalService.addAnimal(animal);
    }

    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable Long id, @RequestBody Animal animal) {
        animal.setId(id);
        return animalService.updateAnimal(id, animal);
    }

    @PutMapping("/trainAnimal.js")
    public ResponseEntity<Void> trainAnimal(@PathVariable ("id") long id, @RequestBody TrainAnimalRequest request) {
        animalService.trainAnimal(id,request.getCommands());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/getDataById.js{id}/")
    public String getAnimalById(@PathVariable ("id") long id) {
        return animalService.getAnimalById(id);
    }

    @GetMapping("/showGeneralInfo.js")
    public ResponseEntity<String> listAnimals(@RequestParam(value = "AnimalList", required = false) String animalList) {
        animalList = animalService.getAllAnimals();
        return new ResponseEntity<>(animalList, HttpStatus.OK);
    }

    @DeleteMapping("/deleteAnimalRecord.js/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable("id") long id) {
        animalService.deleteAnimal(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/viewCommandListById.js/{id}")
    public ResponseEntity<List<String>> getCommandsById(@PathVariable("id") long id) {
        List<String> commands = animalService.getCommands(id);
        return new ResponseEntity<>(commands, HttpStatus.OK);
    }

    @GetMapping("/countAnimalsInPetShop.js")
    public ResponseEntity<Integer> countAnimals() {
        Integer count = animalService.countAnimals();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/sortByName.js")
    public ResponseEntity<Void> sortedByName() {
        animalService.sortByName();
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/sortByDateOfBirth.js")
    public ResponseEntity<List<Animal>> sortedByBirthDate() {
        List<Animal> animals = animalService.sortByBirthDate();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/saveData.js")
    public ResponseEntity<Void> saveAnimals() {
        animalService.saveAnimals();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/loadData.js")
    public ResponseEntity<Void> loadAnimals() {
        animalService.loadAnimals();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

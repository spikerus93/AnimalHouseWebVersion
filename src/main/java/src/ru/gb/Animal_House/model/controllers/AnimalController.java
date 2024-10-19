package src.ru.gb.Animal_House.model.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import src.ru.gb.Animal_House.model.Animal;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to Animal House";
    }

    @PostMapping("/animals/add")
    public ResponseEntity<Animal> addAnimal(@RequestBody Animal animal) {
        animal = animalService.addAnimal(request);
        return new ResponseEntity<>(animal, HttpStatus.CREATED);
    }
    @PutMapping("animals/{id}/train")
    public ResponseEntity<Void> trainAnimal(@PathVariable ("id") long id, @RequestBody TrainAnimalRequest request) {
        animalService.trainAnimal(id,request.getCommands());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/animals/{id}/")
    public ResponseEntity<Animal> getAnimalById(@PathVariable ("id") long id) {
        Optional<Animal> animalOptional = animalService.getAnimalById(id);
    }
    @GetMapping("/animals/list")
    public ResponseEntity<List<Animal>> listAnimals(@RequestParam(value = "species", required = false) String species) {
        List<Animal> animals = animalService.listAnimals(species);
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @DeleteMapping("/animals/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable("id") long id) {
        animalService.deleteAnimal(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/animals/commands/{id}")
    public ResponseEntity<List<String>> getCommandsById(@PathVariable("id") long id) {
        List<String> commands = animalService.getCommandsById(id);
        return new ResponseEntity<>(commands, HttpStatus.OK);
    }

    @GetMapping("/animals/count")
    public ResponseEntity<Integer> countAnimals() {
        Integer count = animalService.countAnimals();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @GetMapping("/animals/generalinfo")
    public ResponseEntity<List<Animal>> generalInfo() {
        List<Animal> animals = animalService.getAllAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/animals/sorted/name")
    public ResponseEntity<List<Animal>> sortedByName() {
        List<Animal> animals = animalService.sortAnimalsByName();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/animals/sorted/dateofbirth")
    public ResponseEntity<List<Animal>> sortedByDateOfBirth() {
        List<Animal> animals = animalService.sortAnimalsByDateOfBirth();
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
}

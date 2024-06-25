package com.qa.lbg.rest;

import com.qa.lbg.entities.Person;
import com.qa.lbg.services.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.service.getAll();
    }


    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return this.service.createPerson(person);
    }

    @DeleteMapping("/remove/{id}")
    public Person removePerson(@PathVariable int id) {
        return this.service.removePerson(id);
    }

    @PatchMapping("/update/{id}")
    public Person updatePerson(@PathVariable int id,
                               @RequestParam(required = false) String name,
                               @RequestParam(required = false) Integer age,
                               @RequestParam(required = false) String job) {
        return this.service.updatePerson(id, name, age, job);
    }

//    @GetMapping("/person/{id}")
//    public ResponseEntity<?> getPerson(@PathVariable Integer id) {
//        if (id == null || id < 0 || id >= this.people.size())
//            return new ResponseEntity<>("No cat found with id: " + id, HttpStatus.NOT_FOUND);
//        else return ResponseEntity.ok(this.people.get(id));
//    }


}

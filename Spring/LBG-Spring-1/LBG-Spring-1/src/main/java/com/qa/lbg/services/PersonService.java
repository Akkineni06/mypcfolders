package com.qa.lbg.services;

import com.qa.lbg.entities.Person;
import com.qa.lbg.repos.PersonRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private PersonRepo repo;

    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }

//    private List<Person> people = new ArrayList<>();
//
    public List<Person> getAll() {
//        return this.people;
        return this.repo.findAll();
    }

    public Person createPerson(Person person) {
//        this.people.add(person);
//        return this.people.get(this.people.size() - 1);
          return this.repo.save(person);
    }

    public Person removePerson(int id) {
//        return this.people.remove(id);
        Person remove = this.repo.findById(id).get();
        this.repo.deleteById(id);
          return remove;
    }

    public Person updatePerson(int id,
                               String name,
                               Integer age,
                               String job) {
//        Person toUpdate = this.people.get(id);
//
//        if (name != null) toUpdate.setName(name);
//        if (age != null) toUpdate.setAge(age);
//        if (job != null) toUpdate.setJob(job);
//
//        return toUpdate;
        Person toUpdate = this.repo.findById(id).get();

        if (name != null) toUpdate.setName(name);
        if (age != null) toUpdate.setAge(age);
        if (job != null) toUpdate.setJob(job);

        return this.repo.save(toUpdate);
    }

//    public ResponseEntity<?> getPerson(@PathVariable Integer id) {
//        if (id == null || id < 0 || id >= this.people.size())
//            return new ResponseEntity<>("No cat found with id: " + id, HttpStatus.NOT_FOUND);
//        else return ResponseEntity.ok(this.people.get(id));
//    }

}

package com.profilematcherapp.profilematcher.controller;

import com.profilematcherapp.profilematcher.entity.Person;
import com.profilematcherapp.profilematcher.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class PersonController {
    @Autowired
    private PersonService personService;

    // POST
    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    // GET
    @GetMapping("/personDetails/{name}")
    public Person getPerson(@PathVariable String name) {
        return personService.getPersonByName(name);
    }

    // add other get methods later

    //PUT
    @PutMapping("/updatePerson")
    public Person updatePerson(@RequestBody Person person) {
        return personService.updatePerson(person);
    }

    // DELETE
    @DeleteMapping("/delete/person/{id}")
    public void deleteCourse(@PathVariable int id) {
        personService.deletePerson(id); // might not work - return type is void
    }
}

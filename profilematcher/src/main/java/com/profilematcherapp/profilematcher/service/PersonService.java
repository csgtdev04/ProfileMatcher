package com.profilematcherapp.profilematcher.service;

import com.profilematcherapp.profilematcher.entity.Person;
import com.profilematcherapp.profilematcher.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    // POST
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    // GET
    public Person getPersonByName(String name) {
        return personRepository.findByName(name);
    }

    // can add get person(s) by gender, major, etc.

    // PUT
    public Person updatePerson(Person newPerson) {
        Person currPerson = personRepository.findById(newPerson.getId()).orElse(null); // new
        // person has same id
        currPerson.setAge(newPerson.getAge());
        currPerson.setGender(newPerson.getGender());
        currPerson.setMajor(newPerson.getMajor());
        return personRepository.save(currPerson);
    }

    // DELETE
    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }
}

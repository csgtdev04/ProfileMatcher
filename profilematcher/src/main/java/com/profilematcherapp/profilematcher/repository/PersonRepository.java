package com.profilematcherapp.profilematcher.repository;

import com.profilematcherapp.profilematcher.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByName(String name);
}

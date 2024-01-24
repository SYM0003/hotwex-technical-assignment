package com.assignment.demo.service;

import com.assignment.demo.entity.Person;
import com.assignment.demo.repositry.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public Person createPerson(Person person){
        return personRepository.save(person);
    }
}

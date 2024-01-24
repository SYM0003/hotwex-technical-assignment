package com.assignment.demo.controller;

import com.assignment.demo.entity.Person;
import com.assignment.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = "person/create")
    ResponseEntity<String> createPerson(Person person){
        personService.createPerson(person);
        return ResponseEntity.ok("person saved successfully");
    }


    @GetMapping("get")
    ResponseEntity<String> get(){
        return ResponseEntity.ok("get message");
    }
}
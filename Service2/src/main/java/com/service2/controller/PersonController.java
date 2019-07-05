package com.service2.controller;

import com.service2.exception.PersonNotFoundException;
import com.service2.model.Person;
import com.service2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

  @Autowired
  private PersonaService personaService;

  @GetMapping("/persons")
  public List<Person> getAllPerson() throws PersonNotFoundException {
    return personaService.getAllPerson();
  }

  @PostMapping("/person")
  public Person addPerson(@RequestBody Person person) {
    return personaService.addPerson(person);
  }

  @PutMapping("/person")
  public Person updatePerson(@RequestBody Person person) {
    return personaService.updatePerson(person);
  }

  @DeleteMapping("/person")
  public String deletePerson(@RequestParam String id) {
    return personaService.deletePerson(id);
  }


}

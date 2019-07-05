package com.service2.service;

import com.service2.exception.PersonNotFoundException;
import com.service2.model.Person;
import com.service2.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class PersonaService {

  @Autowired
  private PersonRepository personRepository;

  public List<Person> getAllPerson() throws PersonNotFoundException {
    List<Person> personList = personRepository.findAll();
    if (!CollectionUtils.isEmpty(personList)) return personList;
    else throw new PersonNotFoundException("");
  }

  public Person addPerson(Person person) {
    return personRepository.save(person);
  }

  public String deletePerson(String id) {
     personRepository.deleteById(Integer.valueOf(id));
     return "deleted";
  }

  public Person updatePerson(Person person) {
    return personRepository.save(person);
  }
}

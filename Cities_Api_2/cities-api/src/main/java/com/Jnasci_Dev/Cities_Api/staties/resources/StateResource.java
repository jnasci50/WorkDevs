package com.Jnasci_Dev.Cities_Api.staties.resources;

import com.Jnasci_Dev.Cities_Api.staties.entities.State;
import com.Jnasci_Dev.Cities_Api.staties.repositories.StateRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

  private final StateRepository repository;

  public StateResource(final StateRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<State> staties() {
    return repository.findAll();
  }
}

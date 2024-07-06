package com.health.fusion.api.dao;

import com.health.fusion.api.model.User;
import com.health.fusion.api.repository.UserRepository;

import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

  private final UserRepository repository;

  public UserDao(UserRepository repository) {
    this.repository = repository;
  }

  public User save(User user) {
    return repository.save(user);
  }

  public Optional<User> findByEmail(String email) {
    return repository.findByEmail(email);
  }

  public Optional<User> findByPhoneNumber(String phoneNumber) {
    return repository.findByEmail(phoneNumber);
  }

}
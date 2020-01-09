package com.example.trial.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.trial.models.User;

public interface UserRepsitory extends CrudRepository<User, Integer> {

}

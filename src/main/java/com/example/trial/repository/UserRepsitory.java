package com.example.trial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.trial.models.User;

@Repository
public interface UserRepsitory extends CrudRepository<User, Integer> {

}

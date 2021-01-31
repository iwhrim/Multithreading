package com.teixeira.multithreading.repositories;

import com.teixeira.multithreading.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

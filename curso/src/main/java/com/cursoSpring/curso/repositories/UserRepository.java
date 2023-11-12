package com.cursoSpring.curso.repositories;

import com.cursoSpring.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

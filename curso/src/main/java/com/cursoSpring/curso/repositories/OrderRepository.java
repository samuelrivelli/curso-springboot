package com.cursoSpring.curso.repositories;

import com.cursoSpring.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

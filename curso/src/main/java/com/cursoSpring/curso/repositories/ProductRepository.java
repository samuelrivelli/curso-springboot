package com.cursoSpring.curso.repositories;

import com.cursoSpring.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

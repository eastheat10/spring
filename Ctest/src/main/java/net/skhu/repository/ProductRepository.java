package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findByOrderById();
	List<Product> findByOrderByIdDesc();
}

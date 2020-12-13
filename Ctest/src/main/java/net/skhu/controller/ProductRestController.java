package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.entity.*;
import net.skhu.repository.*;

@RestController
public class ProductRestController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("rproduct")
	public List<Product> products() {
		return productRepository.findAll();
	}

	@GetMapping("rproduct/{id}")
	public Product product(@PathVariable("id") int id) {
		return productRepository.findById(id).get();
	}

	@GetMapping("rproduct/asc")
	public List<Product> asc() {
		return productRepository.findByOrderById();
	}
}

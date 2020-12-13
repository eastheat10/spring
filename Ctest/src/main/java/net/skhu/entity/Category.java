package net.skhu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String title;

//	@OneToMany(mappedBy="category")
//	List<Product> products;
//
//	public List<Product> getProducts(){
//		return products;
//	}
//
//	public void setProducts(List<Product> products) {
//		this.products = products;
//	}

}

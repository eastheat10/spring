package net.skhu.dto;
import java.util.List;

import lombok.Data;
@Data
public class Category {

	int id;
	String title;

	List<Product> products;
}

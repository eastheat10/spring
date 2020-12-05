package net.skhu.dto;

import lombok.Data;

@Data
public class Product {
	int id;
    String name;
    int categoryId;
    int price;
    int quantity;
    String title;
}

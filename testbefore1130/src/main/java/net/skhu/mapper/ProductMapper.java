package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Product;

@Mapper
public interface ProductMapper {
	List<Product> findAll(int order);
}

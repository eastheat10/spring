package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Product;

@Mapper
public interface ProductMapper {

	@Select("Select * From Product Where id = #{id}")
	Product findOne(int id);

	@Select("Select p.*, c.title  		   		 " +
			"From Product p left join Category c " +
			"On p.categoryId = c.id				 ")
	List<Product> findAll();

	@Update("Update Product Set				" +
			" name = #{ name },				" +
			" categoryId = #{ categoryId }, " +
			" price = #{ price },			" +
			" quantity = #{ quantity } 		" +
			" where id = #{ id }")
	void update(Product product);

}

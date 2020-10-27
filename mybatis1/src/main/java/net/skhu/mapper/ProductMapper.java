package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Product;

@Mapper
public interface ProductMapper {

	@Select("Select * From Product Where id = #{id}")
	Product findOne(int id);

	@Select("Select p.*, c.name 		       	 " +
			"From Product p left join category c " +
			"on p.category = c.id                ")
	List<Product> findAll();

	@Insert("Insert Product (title, category, unitCost, quantity)     " +
			"Value (#{title}, #{category}, #{unitCost}, #{quantity})  ")
    @Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Product product);

	@Update("UPDATE product SET 		" +
			" title = #{title}, 		" +
			" category = #{category},   " +
			" unitCost = #{unitCost},   " +
			" quantity = #{quantity}    " +
			" WHERE id = #{id} ")
      void update(Product product);

	@Delete("Delete from Product where id = #{id}")
	void delete(int id);

}

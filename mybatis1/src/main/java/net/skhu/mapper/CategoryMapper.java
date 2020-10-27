package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Category;

@Mapper
public interface CategoryMapper {

	@Select("SELECT * FROM category")
    List<Category> findAll();

    @Select("SELECT * FROM category WHERE id = #{id}")
    Category findOne(int id);

    @Insert("INSERT category (name) VALUES (#{name})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(Category categroy);

    @Update("UPDATE department SET name = #{name} WHERE id = #{id}")
    void update(Category category);

    @Delete("DELETE FROM category WHERE id = #{id}")
    void delete(int id);

}

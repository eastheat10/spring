package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Department;

@Mapper
public interface DepartmentMapper {

	@Select("select * from department")
	List<Department> findAll();

	@Select("select * from department Where id = #{id}")
	Department findOne(int id);

	@Insert("insert department (departmentName) values (#{departmentName})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Department department);

	@Update("update department Set departmentName = #{departmentName} where id = #{id}")
	void update(Department department);

	@Delete("delete frome department where id = #{id}")
	void delete(int id);

}


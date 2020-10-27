package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {

	@Select("Select * From Student Where id = #{id}")
	Student findOne(int id);

	@Select("select * From Student Where stduentNumber = #{studentNumber}")
	Student findByStudentNumber(String studentNumber);

	@Select("Select s.*, d.departmentName 			" +
			"From Student s left join Department d  " +
			"On s.departmentId = d.id				")
	List<Student> findAll();

	@Insert("Insert Student (studentNumber, name, departmentId, year)  " +
			"Value #{studentNumber}, #{name}, #{departmentID}, #{year} ")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Student studnet);

	@Update("Update Student Set				  " +
			"studentNumber = #{studentNumber} " +
			"name = #{name}					  " +
			"year = #{year}					  " +
			"where id = #{id}				  ")
	void update(Student student);

	@Delete("Delete Student where id = #{id}")
	void delete(int id);
}

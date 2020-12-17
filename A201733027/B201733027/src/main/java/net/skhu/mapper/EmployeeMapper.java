package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Employee;

@Mapper
public interface EmployeeMapper {

	@Select("Select * From Employee Where id = #{id}")
	Employee findOne(int id);

	@Select("select * From Employee Where employeeNo = #{employeeNo}")
	Employee findByEmployeeNo(String employeeNo);

	@Select("Select e.*, d.title  		   			" +
			"From Employee e left join Department d  " +
			"On e.departmentId = d.id				")
	List<Employee> findAll();

	@Insert("Insert Employee (employeeNo, name, departmentId, salary, sex )  " +
			"Value (#{employeeNo}, #{name}, #{departmentId}, #{salary}, #{sex}) ")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Employee employee);

	@Update("Update Employee Set				" +
			" employeeNo = #{ employeeNo }		" +
			" name = #{ name }					" +
			" departmentId = #{ departmentId }  " +
			" salary = #{ salary }				" +
			" sex = #{ sex } 					" +
			" where id = #{ id }")
	void update(Employee employee);

	@Delete("Delete from Employee where id = #{ id }")
	void delete(int id);
}

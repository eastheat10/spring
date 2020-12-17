package net.skhu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Engineer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String employeeNo;
	String name;
	String phone;
	String sex;
	String email;

	@ManyToOne
	@JoinColumn(name = "roleId")
	Role role;

	// @OneToMany(mappedBy="engineer")
	// List<Assignment> assignment;

}

package net.skhu.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Course {
	int id;
	String courseName;
	int deapartmentId;
	int unit;
	int professorId;
	Date startDate;

}

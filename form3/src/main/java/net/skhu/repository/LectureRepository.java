package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Lecture;

public interface LectureRepository extends JpaRepository<Lecture, Integer> {

	int countByProfessorId(int professorId);

}

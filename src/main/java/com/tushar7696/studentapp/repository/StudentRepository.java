package com.tushar7696.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tushar7696.studentapp.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
package com.tushar7696.studentapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tushar7696.studentapp.model.Student;
import com.tushar7696.studentapp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = studentRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setMarks(student.getMarks());
            return studentRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}

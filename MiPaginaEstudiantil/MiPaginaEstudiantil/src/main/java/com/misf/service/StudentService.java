package com.misf.service;

import com.misf.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    // Método para agregar un estudiante
    public void addStudent(Student student) {
        students.add(student);
    }

    // Método para obtener todos los estudiantes
    public List<Student> getAllStudents() {
        return students;
    }

    // Método para buscar un estudiante por ID
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    // Método para eliminar un estudiante por ID
    public boolean deleteStudentById(int id) {
        return students.removeIf(student -> student.getId() == id);
    }
}

package pro.sky.homework31.service;

import org.springframework.stereotype.Service;
import pro.sky.homework31.model.Faculty;
import pro.sky.homework31.model.Student;
import pro.sky.homework31.repository.StudentRepository;

import java.util.Collection;
import java.util.List;


@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);

    }

    public Student findStudent(Long id) {
        return studentRepository.getById(id);
    }

    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> getStudentsAccordingAge(int age) {
        return studentRepository.findStudentByAge(age);
    }

    public Collection<Student> findByAgeBetween(int min, int max){
        return studentRepository.findByAgeBetweenIgnoreCase(min, max);
    }
    public Faculty findFacultyByStudent(long id){
        return studentRepository.getReferenceById(id).getFaculty();
    }

}

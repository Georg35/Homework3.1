package pro.sky.homework31.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.homework31.model.Student;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findStudentByAge(int age);
    Collection<Student> findStudentByAge (Integer age);
    Collection<Student> findByAgeBetweenIgnoreCase(int min, int max);
}

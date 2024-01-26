package pro.sky.homework31.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.homework31.model.Faculty;

import java.util.Collection;
import java.util.List;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
    List<Faculty> findByColor(String color);
    Collection<Faculty> findFacultyByColorOrNameContainsIgnoreCase  (String color, String name);
    Collection<Faculty>findFacultyByNameIgnoreCase (String name);
    Collection<Faculty>findFacultyByColorIgnoreCase (String color);

}

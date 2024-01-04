package pro.sky.homework31.service;

import org.springframework.stereotype.Service;
import pro.sky.homework31.model.Faculty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FacultyService {

    private final Map<Long, Faculty> facultyMap = new HashMap<>();

    private static Long countf = 0L;

    public FacultyService() {
    }

    public Faculty add(Faculty faculty) {
        faculty.setId(++countf);
        facultyMap.put(faculty.getId(),faculty);
        return faculty;

    }

    public Faculty remove(Long id) {
        facultyMap.remove(id);
        return facultyMap.get(id);
    }

    public Faculty find(Long id)  {


        return facultyMap.get(id);

    }

    public Faculty change(Long id,Faculty faculty) {
        facultyMap.put(id, faculty);
        faculty.setId(id);
        return faculty;

    }
    public List<Faculty> find(String color) {


        final List<Faculty> colorFaculty =
                facultyMap.values().stream()
                        .filter(e -> e.getColor().equals(color))
                        .collect(Collectors.toList());

        return colorFaculty;
    }
}

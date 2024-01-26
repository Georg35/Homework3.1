package pro.sky.homework31.service;

import org.springframework.stereotype.Service;
import pro.sky.homework31.model.Faculty;
import pro.sky.homework31.repository.FacultyRepository;
import java.util.Collection;
import java.util.List;
@Service
public class FacultyService {

    private FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFaculty(Long id) {
        return facultyRepository.getById(id);
    }

    public Faculty editFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAllFaculties() {
        return facultyRepository.findAll();
    }

    public List<Faculty> getFacultyAccordingColor(String color) {
        return facultyRepository.findByColor(color);
    }

    public Collection<Faculty> getFacultyByColorOrName(String color, String name) {
        return facultyRepository.findFacultyByColorOrNameContainsIgnoreCase(color, name);
    }

    public Collection<Faculty> findFacultyByName(String name) {
        return facultyRepository.findFacultyByNameIgnoreCase(name);

    }

    public Collection<Faculty> findAllFaculties() {
        return facultyRepository.findAll();
    }


}

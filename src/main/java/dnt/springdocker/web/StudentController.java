package dnt.springdocker.web;

import dnt.springdocker.model.Student;
import dnt.springdocker.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {

    private final StudentRepository studentRepo;

    @Autowired
    public StudentController(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    @GetMapping("")
    public List<Student> getStudents() {
        log.info("Get all students API is called!");
        return studentRepo.findAll();
    }
}

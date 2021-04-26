package managestudent.educationsystem.Controllers;

import managestudent.educationsystem.Models.Student;
import managestudent.educationsystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    private List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    private void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @PutMapping
    private Student editStudent(@RequestBody Student student) {
        return studentService.editStudent(student);
    }

    @DeleteMapping(value = "/{id}")
    private void deleteStudent(@PathVariable("id") Integer id) {
        studentService.deleteStudent(id);
    }

}

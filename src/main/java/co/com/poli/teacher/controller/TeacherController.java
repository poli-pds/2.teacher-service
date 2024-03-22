package co.com.poli.teacher.controller;

import co.com.poli.teacher.persistence.entity.Teacher;
import co.com.poli.teacher.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;

    @PostMapping
    public Teacher save(@RequestBody Teacher teacher) {
        return teacherService.save(teacher);
    }

    @GetMapping
    public List<Teacher> findAll() {
        return teacherService.findAll();
    }

}

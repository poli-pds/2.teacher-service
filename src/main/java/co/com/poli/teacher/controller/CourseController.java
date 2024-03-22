package co.com.poli.teacher.controller;

import co.com.poli.teacher.persistence.entity.Course;
import co.com.poli.teacher.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

@PostMapping
    public Course save(@RequestBody Course course) {
        return courseService.save(course);
    }

@GetMapping
    public List<Course> findAll() {
        return courseService.findAll();
    }
}

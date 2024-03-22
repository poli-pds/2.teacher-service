package co.com.poli.teacher.service;

import co.com.poli.teacher.persistence.entity.Course;

import java.util.List;

public interface CourseService {
    Course save(Course course);
    List<Course> findAll();
}


package co.com.poli.teacher.service;

import co.com.poli.teacher.persistence.entity.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher save(Teacher teacher);
    List<Teacher> findAll();
}

package com.vismijatech.main.service;

import com.vismijatech.main.entity.Course;
import com.vismijatech.main.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public List<Course> getAllCourseDetails() {
        return courseRepository.findAll();
    }
}

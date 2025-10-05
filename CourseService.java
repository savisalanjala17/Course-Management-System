package com.example.Course.Registration.System.service;
import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.repository.CourseRegistryRepo;
import com.example.Course.Registration.System.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CourseService {
    @Autowired CourseRepo courserepo;
    @Autowired CourseRegistryRepo courseregistryrepo;

    public List<Course> availablecourses() {
        return courserepo.findAll();
    }

    public List<CourseRegistry> enrolledstudents() {
        return courseregistryrepo.findAll();
    }


    public void enrollcourse(String name, String emailId, String courseName)
    {
        CourseRegistry courseregistry = new CourseRegistry(name,emailId,courseName);
        courseregistryrepo.save(courseregistry);
    }


    public Course addcourse(Course course) {
        return courserepo.save(course);
    }

    public void deleteCourse(String id) {
        courserepo.deleteById(id);
    }
}
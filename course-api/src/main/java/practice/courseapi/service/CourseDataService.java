package practice.courseapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.courseapi.model.Course;
import practice.courseapi.model.CourseRepository;
import practice.courseapi.model.Topic;

@Service
public class CourseDataService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses :: add);
		return courses;
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}
	
	public void updateCourse(Course course, String id) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
		
	}
	
	

}

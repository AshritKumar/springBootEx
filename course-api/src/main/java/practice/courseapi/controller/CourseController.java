package practice.courseapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import practice.courseapi.model.Course;
import practice.courseapi.service.CourseDataService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseDataService courseService;
	
	@RequestMapping("/topics/{topicId}/cources")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}
	
	@RequestMapping("/topics/{topicId}/cources/{id}") // id is the variable part
	public Course getCourse(@PathVariable String id) { // capture that in the local variable
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics{topicId}/cources")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	
	  @PutMapping("/topics/{id}") 
	  public void updateCourse(@RequestBody Course course, @PathVariable String id) { // converts the json in request body to topic instance 
	  courseService.updateCourse(course, id); 
	  }
	  
	  @DeleteMapping("/topics/{id}") 
	  public void deleteCourse(@PathVariable String id) { 
		  courseService.deleteCourse(id); 
		}
	 
}

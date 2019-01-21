package practice.courseapi.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	// CrudRepository has all the basic CRUD methods for any given entity. But if we want addition logic before updating or gettin data
	// we have to write additional logic.
	
	// insted of writing the logic to get the data , the spring jpa api has some shortcuts where it can perform our custom logic.
	// the short cut is to name the methods according to somme conventions which the jpa api on how to filter data
	
	//----- for finding based on a perticular property in entity -----//
	//1. method nae has to start with find and should have 'By' after it. Net we have to specify the property on which we have to filter the data
	
	// ex find by course name
	
	public List<Course> findByName(String name); // we dont have to provide the implementation, jpa gets the data based on the name
	
	public List<Course> findByDescription(String desc);
	
	// but if its not a simple property but another entity which has a mapping like Topic inside course we have to name it little differently
	
	public List<Course> findByTopicId(String topicId); // We should also ass the primary key of the entity on which we are filtering data. Here we are adding Id at end which is primary key of the Topic

}

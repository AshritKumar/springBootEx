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

import practice.courseapi.model.Topic;
import practice.courseapi.service.TopicDataService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicDataService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}") // id is the variable part
	public Topic getTopic(@PathVariable String id) { // capture that in the local variable
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) { // converts the json in request body to topic instance
		topicService.addTopic(topic);
	}
	
	
	  @PutMapping("/topics/{id}") 
	  public void updateTopic(@RequestBody Topic topic, @PathVariable String id) { // converts the json in request body to topic instance 
	  topicService.updateTopic(topic, id); 
	  }
	  
	  @DeleteMapping("/topics/{id}") 
	  public void deleteTopic(@PathVariable String id) { 
		  topicService.delete(id); 
		}
	 
}

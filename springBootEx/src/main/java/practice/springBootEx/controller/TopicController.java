package practice.springBootEx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practice.springBootEx.model.Topic;
import practice.springBootEx.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getTopics();
	}
	
	@RequestMapping("/topics/{id}") // id is the variable part
	public Topic getTopic(@PathVariable String id) { // capture that in the local variable
		return topicService.getTopic(id);
	}
}

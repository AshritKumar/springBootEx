package practice.courseapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.courseapi.model.Topic;
import practice.courseapi.model.TopicRepository;

@Service
public class TopicDataService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics :: add);
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public Topic getTopic(String id) {
		return topicRepository.findById(id).get();
	}
	
	

}

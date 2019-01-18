package practice.courseapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import practice.courseapi.model.Topic;

@Service
public class TopicService {
	
	private static List<Topic> topics =  new ArrayList<>(Arrays.asList(
			new Topic("javascript", "Java Script course", "Java Script course description")	,
			new Topic("java", "Java course", "Java course description")	,
			new Topic("hibernate", "Hibernatet course", "Hibernate course description")	
		));
	
	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	} 

	public void updateTopic(Topic topic, String id) {
		topics.stream().filter(t -> t.getId().equals(id)).forEach(t -> {
			t.setName(topic.getName());
			t.setDescription(topic.getDescription());
		});
		
	}

	public void delete(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}

}

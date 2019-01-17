package practice.springBootEx.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import practice.springBootEx.model.Topic;

@Service
public class TopicService {
	
	private static List<Topic> topics =  Arrays.asList(
			new Topic("javascript", "Java Script course", "Java Script course description")	,
			new Topic("java", "Java course", "Java course description")	,
			new Topic("hibernate", "Hibernatet course", "Hibernate course description")	
		);
	
	public List<Topic> getTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
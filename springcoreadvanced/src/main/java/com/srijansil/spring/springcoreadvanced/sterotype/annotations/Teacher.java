package com.srijansil.spring.springcoreadvanced.sterotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tea")
@Scope(scopeName = "prototype")
public class Teacher {

	@Value("10")
	private int id;

	@Value("Srijansil Bohara")
	private String name;

	@Value("#{allTopics}")
	private List<String> topics;

	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + "]";
	}

}

package com.firstgoogleapp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

import com.google.appengine.api.datastore.Entity;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, skillSet, workExperience, education, aboutMe, hobbies, interests;
	private ArrayList<String> friends;
	private int numFriends;
	public User(){
		
	}
	
	public User(String name, String skillSet, String workExperience,
			String education, String aboutMe, String hobbies, String interests,
			int numFriends,ArrayList<String> friends) {
		super();
		this.name = name;
		this.skillSet = skillSet;
		this.workExperience = workExperience;
		this.education = education;
		this.aboutMe = aboutMe;
		this.hobbies = hobbies;
		this.interests = interests;
		this.numFriends = numFriends;
		this.friends = friends;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public String getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public int getNumFriends() {
		return numFriends;
	}
	public void setNumFriends(int numFriends) {
		this.numFriends = numFriends;
	}

	public ArrayList<String> getFriends() {
		return friends;
	}
	public void setFriends(ArrayList<String> friends) {
		this.friends = friends;
	}
	
	
	
}

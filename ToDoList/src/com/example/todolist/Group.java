package com.example.todolist;

import java.util.HashMap;

public class Group {
	private HashMap<String,Person> members;
	private HashMap <String,Task> tasks;
	private String name;
	
	//constructor
	public Group(){
		name = "Creed";
		tasks = new HashMap<String,Task>();
		members = new HashMap<String,Person>();
	}
	
	public Group(String name, Person self){
		this.name = name;
		tasks = new HashMap<String,Task>();
		members = new HashMap<String,Person>();
		members.put(self.getName(), self);
	}
	
	//getters setters
	public void setName (String name){
		this.name=name;
		
	}
	public String getName(){
		return name;
	}
	public HashMap <String,Task> getTasks (){
		return tasks;
		
	}
	public HashMap <String,Person> getMembers(){
		return members;
	}
	public void addTask(Task job){
		tasks.put(job.getName(), job);
	}v  
	
}

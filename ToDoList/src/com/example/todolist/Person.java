package com.example.todolist;
import java.util.ArrayList;
import java.util.HashMap;


public class Person {
	private String pw;
	private String email;
	private String name;
	private HashMap<String, Task> tasks;
	private HashMap <String, Group> groups;
	//private 
	
	//constructor
	public Person (){
		pw = "123";
		email = "John123@asdf.com";
		name ="John Doe";
		this.tasks = new HashMap<String, Task>();
		this.groups=new HashMap<String,Group>();
	}
	public Person (String pw, String email, String name){
		this.pw = pw;
		this.email = email;
		this.name = name;
		this.tasks = new HashMap<String, Task>();
		this.groups=new HashMap<String,Group>();
	}
	
	
	
	//getters and setters
	public void addGroup(String name, Group group){
		groups.put(name, group);
	}
	public void removeGroup(String name, Group group){
		groups.remove(name);
	}
	public void setEmail (String email){
		this.email = email;
	}
	public void setpw (String pw){
		this.pw=pw;
	}
	public void setName (String name){
		this.name = name;
	}
	public void addTask (String jobName, Task job){
		tasks.put(jobName, job);
	}
	public void removeTask(String jobName){
		tasks.remove(jobName);
	}
	public String getEmail (){
		return email;
	}
	public String getpw (){
		return pw;
	}
	public String getName (){
		return name;
	}
	public HashMap<String,Task> getTasks (){
		return tasks;
	}
	public HashMap<String,Group> getGroups (){
		return groups;
	}
}

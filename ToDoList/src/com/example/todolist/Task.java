package com.example.todolist;
import java.util.ArrayList;
import java.util.HashMap;

//due date alarm, organization, email notification
public class Task {
	private String name;
	private boolean done;
	private String description;
	private Group belongTo;
	private HashMap <String, Person> assignedTo;
	public Task(){
		name = "Impossible job";
		done =false;
		description ="No description.";
		belongTo=null;
		assignedTo= new HashMap <String, Person>();
	}
	public Task (String name,String description, Group belongTo, HashMap <String, Person> assignedTo){
		this.name=name;
		this.description = description;
		this.belongTo=belongTo;
		this.assignedTo = assignedTo;
		this.done = false;
		
	}
	public String getName(){
		return name;
	}
	public void setName (String name){
		this.name=name;
	}
	public boolean isDone (){
		return done;
	}
	public void setDone (){
		done=true;
	}
	public void setNotDone (){
		done = false;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String desc){
		description=desc;
	}
	public Group getBelongTo(){
		return belongTo;
	}
	public void setBelongTo (Group belong){
		belongTo = belong;
	}
	public void addAssignedTo (Person newGuy){
		assignedTo.put(newGuy.getName(), newGuy);
	}
	public void removeAssignedTo (Person newGuy){
		assignedTo.remove(newGuy.getName());
	}
}

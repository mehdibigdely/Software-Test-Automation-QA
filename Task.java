
package snhu_gss_mahdiB;

public class Task {
	
	private String taskId;
    private String taskName;
    private String taskDescription;
    
    public Task(String id, String name, String description) {
    	if (id == null || id.length() >= 10) {
  	      throw new IllegalArgumentException("Problem! task ID is either longer than 10 characters or is left empty/blank.");
    	}
    	if (description == null || description.length() >= 50) {
    		throw new IllegalArgumentException("Problem! task description is either longer than 50 characters or is left empty/blank.");
    	}
    	
    	if (name == null || name.length() >= 20) {
  	      throw new IllegalArgumentException("Problem! task name is either longer than 20 characters or is left empty/blank.");
    	}
   
    	this.setTaskId(id);
    	this.setTaskName(name);
    	this.setDescription(description);
    }
    public void setTaskName(String name) {
    	if (name == null || name.length() >= 20) {
    	      throw new IllegalArgumentException("Problem! task name is either longer than 20 characters or is left empty/blank.");
    	} 
    	else {
    	      this.taskName = name;
    	    }
    }
    
    public void setDescription(String desc) {
    	if (desc == null || desc.length() >= 50) {
    		throw new IllegalArgumentException("Problem! task description is either longer than 50 characters or is left empty/blank.");
    
    	}
    	else {
    		this.taskDescription = desc;
    	}
    }

    public void setTaskId(String id) {
    	if (id == null || id.length() >= 10) {
    	      throw new IllegalArgumentException("Problem! task ID is either longer than 10 characters or is left empty/blank.");
    	} 
    	else {
    	      this.taskId = id;
    	      }
    	}
    
    public String getTaskId() {
    	return taskId;
    }
    
    public String getTaskName() {
    	return taskName;
    
    }
    public String getTaskDescription() {
    	return taskDescription;
    }
 }

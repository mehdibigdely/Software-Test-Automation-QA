
package snhu_gss_mahdiB;
import java.util.ArrayList;

public class TaskService {
	//creates an Array list for tasks
	ArrayList<Task> tasks;
	
	public TaskService() {
		tasks = new ArrayList<>();
	}
	//creates a new task using an ID
	public boolean addTask(Task newTask) {
		boolean taskAlreadyExists = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(newTask.getTaskId())) {
				taskAlreadyExists = true;
				break;
			}
		}
		if (!taskAlreadyExists) {
		 tasks.add(newTask);
		 return true;
			
		} else {
			String taskIdStr = newTask.getTaskId();
			throw new IllegalArgumentException("A task with this ID \'" + taskIdStr + "\' already exists; only unique ID is allowed for new tasks.");
		}
	}
	//deletes a task using an ID
	public boolean deleteTask(String taskId) {
		boolean taskDeleted = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(taskId)) {
				tasks.remove(task);
				taskDeleted = true;
				break;
			}
		}
		return taskDeleted;
	}
	
	//updates the task name using ID
	public boolean updateTaskName (String taskId, String newName) {
		boolean taskNameUpdated = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(taskId)) {
				task.setTaskName(newName);
				taskNameUpdated = true;
				break;
			}
		}
		return taskNameUpdated;
	}
	
	//updates task's Description using task Id
	public boolean updateDescription (String taskId, String newDescr) {
		boolean taskDescriptionUpdated = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(taskId)) {
				task.setDescription(newDescr);
				taskDescriptionUpdated = true;
				break;
			}
	}
return taskDescriptionUpdated;
	}
}
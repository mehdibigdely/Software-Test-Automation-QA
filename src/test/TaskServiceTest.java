package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import snhu_gss_mahdiB.Task;
import snhu_gss_mahdiB.TaskService;

class TaskServiceTest {
	TaskService taskService = new TaskService();
	Task task = new Task("ABCDE", "Task's Name", "Task's description");

	//tests new task creation
	@Test
	void testTaskServiceAdd() {
		assertEquals(true, taskService.addTask(task));
	}
	//tests new tasks creation - multiple
	@Test
	void testTaskServiceMultipleTasks() {
		Task task1 = new Task("LDRTYU", "Task's Name", "Task's description");
		taskService.addTask(task);
		assertEquals(true, taskService.addTask(task1));
	}
	
	//tests updating task's name
	@Test
	void testTaskServiceUpdateName() {
		taskService.addTask(task);
		assertEquals(true, taskService.updateTaskName("ABCDE", "Updated/new name"));

	}
	
	//tests updating name using a wrong/non-existing ID
	@Test
	void testTaskServiceUpdateNameWrongId() {
		taskService.addTask(task);
		assertEquals(false, taskService.updateTaskName("OPQRSTU", "Updated/new name"));
	}

	//tests updating task's description
	@Test
	void testTaskServiceUpdateDescription() {
		taskService.addTask(task);
		assertEquals(true, taskService.updateDescription("ABCDE", "Updated/new description"));
	}

	//tests updating description using a wrong/non-existing ID
	@Test
	void testTaskServiceUpdateDescriptionWrongId() {
		taskService.addTask(task);
		assertEquals(false, taskService.updateDescription("FGHIJKL", "Updated/new description"));
	}

	//tests creation of new task using an existing/duplicate ID
	@Test
	void testTaskServiceNoDuplicateIds() {
		taskService.addTask(task);
		Task newTask = new Task("ABCDE", "Name One", "Description One");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.addTask(newTask);
		});
	}

	//test task removal/deletion using ID
	@Test
	void testTaskServiceDeleteTask() {
		taskService.addTask(task);
		assertEquals(true, taskService.deleteTask("ABCDE"));
	}
}
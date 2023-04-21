package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import snhu_gss_mahdiB.Task;

class TaskTest {

	//tests creation of new task with good inputs
	@Test
	void testTaskCreated() {
		Task task = new Task("ABCDE", "Task Name ", "Task description");
		assertTrue(task.getTaskId().equals("ABCDE"));
		assertTrue(task.getTaskName().equals("Task Name "));
		assertTrue(task.getTaskDescription().equals("Task description"));
	}

	//tests task ID to be 10 characters or less 
	@Test
	void testIdCharLimit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("ABCDE111222ABCDE", "Task Name ", "Task description");
		});
	}

	//tests task ID for not being empty/blank
	@Test
	void testIdNullCheck() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Task Name", "Task description");
		});
	}

	//tests task name to be 20 characters or less 
	@Test
	void testNameCharLimitTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("ABCDE", "Task name is longer than 20 characters here", "Task description");
		});

	}

	//tests tasks name when it is blank/empty
	@Test
	void testNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("ABCDE", null, "Task description");
		});
	}

	//tests description characters to be 50 characters or less and not blank 
	@Test
	void testDescriptionCharLimit() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("ABCDE", "Task Name ",
					"Task's description should be 50 characters or less and can not be blank/empty; an exception error id either are not met.");
		});
	}

	//tests when description is left empty or blank
	@Test
	void testDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("ABCDE", "Task Name ", null);
		});
	}
}

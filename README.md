# Software-Test-Automation-QA
Final Project for CS-320 at SNHU
To make sure that the code is secure and functional, I tried to separate the development, testing and operational environments by have an experienced tester looking at both code and tests, and verifying that the code is achieving the software requirements, while the Junit tests are testing what is meant to be checked and scrutinized. This helped a little bit with preventing test bias. 
Each line of code was reviewed and tested regularly in an attempt to identify issues, errors, warnings and problems in early stages, before it gets hard or costly to find the root cause.
the other measure to keep the code safe was to prevent unauthorized people to access the sources code (Access-control), and I also used a version control to make sure that old or dead codes that may contain bugs are not used. Junit tests were developed and successfully passed for all functionalities to make sure that they produce desired outcomes, while automation helped to achieve more secure code. 

To make my code more secure, I could study other similar vulnerabilities and learn about their root cause, identify any possible patterns, prevent repeated occurrences, and update the SDLC based on those findings, my learnings, and improved knowledge. It is always a wise choice to stay up to date, follow current best practices, be proactive and look ahead to see what is or may be coming.
This code was submitted as the final project for CS-320 Software Test Automation& QA class at SNHU; here are the assignment requirements:


ContactService, TaskService, and AppointmentService Files
For this assignment, you will incorporate the code and unit tests that you have developed for the mobile application. First, you developed the contact service and contact object, which you completed in the Module Three milestone. Second, you developed the task service and task object, which you completed in the Module Four milestone. Last, you developed the appointment service and appointment object, which you completed in Module Five milestone. Any feedback received on these assignments should be incorporated prior to submitting the files for this final project.
You have been asked to code up a mobile application for a client and provide unit tests to verify that it meets the customer’s requirements. In order to do so, you must complete the following:
1.	Contact Service: In the Module Three milestone, you developed the contact service. The contact service used in-memory data structures to support storing contacts (no database required). In addition, there was no UI for this assignment. You verified the contact service through JUnit tests. The contact service contained a contact object along with the contact service. The requirements were as follows:
a.	Contact Class Requirements
i.	The contact object shall have a required unique contact ID String that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
ii.	The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
iii.	The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
iv.	The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
v.	The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
b.	Contact Service Requirements
i.	The contact service shall be able to add contacts with unique ID.
ii.	The contact service shall be able to delete contacts per contactId.
iii.	The contact service shall be able to update contact fields per contactId. The following fields are updatable:
1.	firstName
2.	lastName
3.	PhoneNumber
4.	Address
2.	Task Service: In the Module Four milestone, you developed the task service. The task service used in-memory data structures to support storing tasks (no database required). In addition, there was no UI for this assignment. You verified the task service through JUnit tests. The task service contained a task object along with the task service. The requirements were as follows:
a.	Task Requirements
i.	The task object shall have a required unique task ID String that cannot be longer than 10 characters. The task ID shall not be null and shall not be updatable.
ii.	The task object shall have a required name String field that cannot be longer than 20 characters. The name field shall not be null.
iii.	The task object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
b.	Task Service Requirements
i.	The task service shall be able to add tasks with a unique ID.
ii.	The task service shall be able to delete tasks per taskId.
iii.	The task service shall be able to update task fields per taskId. The following fields are updatable:
1.	name
2.	description
3.	Appointment Service: In the Module Five milestone, you developed the appointment service. The appointment service used in-memory data structures to support storing appointments (no database required). In addition, there was no UI for this assignment. You verified the appointment service through JUnit tests. The appointment service contained an appointment object along with the appointment service. The requirements were as follows:
a.	Appointment Requirements
i.	The appointment object shall have a required unique appointment ID String that cannot be longer than 10 characters. The appointment ID shall not be null and shall not be updatable.
ii.	The appointment object shall have a required appointment Date field. The appointmentDate field cannot be in the past. The appointmentDate field shall not be null. Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past.
iii.	The appointment object shall have a required description String field that cannot be longer than 50 characters. The description field shall not be null.
b.	Appointment Service Requirements
i.	The appointment service shall be able to add appointments with a unique appointmentId.
ii.	The appointment service shall be able to delete appointments per appointmentId.
Specifically, the following rubric criteria must be addressed:
•	Verify the Contact class meets the requirements through JUnit tests.
•	Verify the ContactService class meets the requirements through JUnit tests.
•	Verify the Task class meets the requirements through JUnit tests.
•	Verify the TaskService class meets the requirements through JUnit tests.
•	Verify the Appointment class meets the requirements through JUnit tests.
•	Verify the AppointmentService class meets the requirements through JUnit tests.
•	Ensure the test coverage for the java files has 80% coverage or higher.

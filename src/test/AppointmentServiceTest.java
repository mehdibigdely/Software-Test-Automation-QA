package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import snhu_gss_mahdiB.Appointment;
import snhu_gss_mahdiB.AppointmentService;

class AppointmentServiceTest {

	AppointmentService appointmentService = new AppointmentService();
	Date date1 = new GregorianCalendar(2024, Calendar.APRIL, 01).getTime();
	Appointment appointment = new Appointment("ABCDE", date1, "Description used as a test");

	//tests addition of 1 appointment
	@Test
	void testAppointmentService_Should_Create_one_Appointment() {
		assertEquals(true, appointmentService.addAppointment(appointment));
	}
	
	//tests addition of multiple appointments
	@Test
	void testAppointmentService_Should_Create_Multple_Appointments() {
		Appointment newAppointment = new Appointment("IJKLMNO", date1, "Test Description Multiple");
		appointmentService.addAppointment(appointment);
		assertEquals(true, appointmentService.addAppointment(newAppointment));
	}

	//checks ID for duplicates and to make sure only unique IDs are accepted
	@Test
	void testAppointmentService_Should_Not_Create_AppointmentWithDuplicate_ID() {
		appointmentService.addAppointment(appointment);
		Appointment newAppt = new Appointment("ABCDE", date1, "Description used as a test");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.addAppointment(newAppt);
		});
	}

	//deletes appointment based on the provided ID
	@Test
	void testAppointmentService_Should_Delte_Appointment_Using_ID() {
		appointmentService.addAppointment(appointment);
		assertEquals(true, appointmentService.deleteAppointment("ABCDE"));
	}

	//throws exception error if the provided ID does not exist
	@Test
	void testAppointmentService_Should_Throw_Error_If_ID_Not_Found() {
		appointmentService.addAppointment(appointment);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.deleteAppointment("BADEC");
		});
	}
}

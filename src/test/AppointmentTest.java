package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import snhu_gss_mahdiB.Appointment;

class AppointmentTest {

	Date date1 = new GregorianCalendar(2024, Calendar.APRIL, 01).getTime();
	Date date2 = new GregorianCalendar(2022, Calendar.DECEMBER, 22).getTime();

	//creates appointment
	@Test
	void testAppointmentCreated() {
		Appointment appt = new Appointment("ABCDE", date1, "Test appiointment creation");
		assertTrue(appt.getAppointmentId().equals("ABCDE"));
		assertTrue(appt.getAppointmentDate().equals(date1));
		assertTrue(appt.getAppointmentDescription().equals("Test appiointment creation"));
	}

	//tests Id when it is longer than 10 characters
	@Test
	void testAppointmentTooLongId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("ABCDEFGHIJKLMNO", date1, "For Test");
		});
	}

	//tests when ID filed is left empty/null
	@Test
	void testAppointmentNullIdInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, date1, "For Test of empty ID field");
		});

	}

	//tests when date filed is left empty/null
	@Test
	void testAppointmentNullDateInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("ABCDE", null, "For Testing empty date field");
		});

	}

	//tests when appointment date is in the past
	@Test
	void testAppointmentPastDateInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("ABCDE", date2, "When past time used as appointment date");
		});

	}

	//test long description exception error
	@Test
	void testAppointmentDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("ABCDE", date1,
					"Description of the appointment need to be 50 charcters or less and cannot be left empty/blank; "
					+ "as in this example, either situations that mentioned will cause an exception error.");
		});
	}

	//tests when description is left blank/empty
	@Test
	void testAppointmentDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("ABCDE", date1, null);
		});

	}

}

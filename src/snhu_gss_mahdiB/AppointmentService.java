package snhu_gss_mahdiB;

import java.util.ArrayList;

public class AppointmentService {
	
	//creates an instance Array from Appointment class and names it as appointments
	ArrayList<Appointment> appointments;
	
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	//checks appointments for any duplicates and adds new appointment using an ID
	//returns true upon success and false+exception error if ID already exists
	public boolean addAppointment(Appointment newAppointment) {
		boolean idAlreadyExists = false;
		for (Appointment appt : appointments) {
			if (appt.getAppointmentId().equals(newAppointment.getAppointmentId())) {
				idAlreadyExists = true;
				break;
			}
		}
		if (!idAlreadyExists) {
			appointments.add(newAppointment);
			return true;
		}
		else {
			throw new IllegalArgumentException("Problem! appointment ID cannot be used before/duplicate.");
		}
	}
	
	//searches appointments using an ID and deletes it if found
	//returns true upon success (deletion) and false+exception error if ID already exists
	public boolean deleteAppointment(String appointmentId) {
		boolean deleted = false;
		for (Appointment appt : appointments) {
			if (appt.getAppointmentId().equals(appointmentId)) {
				appointments.remove(appt);
				deleted = true;
				break;
			}
		}
		if (!deleted) {
			
			throw new IllegalArgumentException("Problem! an appointment with this ID \'" + appointmentId + "\' was not found.");
		}
		else {
			return deleted;
		}
	}

}

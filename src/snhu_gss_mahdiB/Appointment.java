package snhu_gss_mahdiB;

import java.util.Date;

public class Appointment {
	private String appointmentId;
	private String appointmentDescription;
	Date appointmentDate = new Date(); 
	
	//checks and then sets appointment ID, date, and description
	public Appointment( String appointmentId, Date appointmentDate, String appointmentDescription) {
		Date currentDate = new Date();
		
		//checks appointment identification (ID) to be 10 characters or less, and cannot be left empty; otherwise throws exception error message
		if (appointmentId == null || appointmentId.length() >= 10) {
			throw new IllegalArgumentException("Problem! appointment ID should be 10 characters or shorter & cannot be empty.");
		}
		
		//checks appointment date to be in a future time, and cannot be left empty; otherwise throws exception error message
		if (appointmentDate == null || appointmentDate.before(currentDate)) {
			System.out.println(appointmentDate);
			throw new IllegalArgumentException("Problem! appointment time should be in a future date/time and cannot be empty.");
		}
		
		//checks appointment description to be 50 characters or less, and cannot be left empty; otherwise throws exception error message
		if (appointmentDescription == null || appointmentDescription.length() >= 50) {
			throw new IllegalArgumentException("Problem! description should not be more than 50 characters or left empty.");
		}
		
		//sets appointment, date, and description, after they pass the above-mentioned conditions
		this.setAppointmentId(appointmentId);
		this.setAppointmentDate(appointmentDate);
		this.setAppointmentDescription(appointmentDescription);
	
		}
	
	//checks and then sets appointment ID
	public void setAppointmentId(String appointmentId) {
		if (appointmentId == null || appointmentId.length() >= 10) {
			throw new IllegalArgumentException("Problem! appointment ID should be 10 characters or shorter & cannot be empty.");
		}
		else {
			this.appointmentId = appointmentId;

		}
	}
		
	//checks and then sets appointment date 
		public void setAppointmentDate(Date appointmentDate) {
			Date currentDate = new Date();
			if (appointmentDate == null || appointmentDate.before(currentDate)) {
				throw new IllegalArgumentException("Problem! appointment time should be in a future date/time and cannot be empty.");
			
		}
			else {
				this.appointmentDate = appointmentDate;
			}
		}
		
		//checks and then sets appointment description
		public void setAppointmentDescription(String appointmentDescription) {
			if (appointmentDescription == null ||appointmentDescription.length() >= 50) {
				throw new IllegalArgumentException("Problem! description should not be more than 50 characters or left empty.");
		}
			else {
				this.appointmentDescription = appointmentDescription;
			}
		}
		
		public String getAppointmentId() {
			return this.appointmentId;
		}
		
		public Date getAppointmentDate() {
			return this.appointmentDate;
		}
		
		public String getAppointmentDescription() {
			return this.appointmentDescription;
		}
}
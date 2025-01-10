/**
 * @author Koirala
 */
public class Appointment {
    public int appointmentId;
    public String appointmentDate;
    public int appointmentTime;
    public Patient patient;

    /**
     * Reschedule the appointment
     */
    public void rescheduleAppointment(){
        System.out.println("Rescheduled appointment");
    }

    /**
     * Cancel the appointment
     */
    public void cancelAppointment(){
        System.out.println("Cancelled appointment");
    }

    /**
     *
     * @return the appointment details
     */
    public String viewAppointmentDetails(){
        return "Appointment Date: " + appointmentDate + "\n" +
                "Appointment Time: " + appointmentTime + "\n" +
                "Patient: " + patient.name;
    }
}

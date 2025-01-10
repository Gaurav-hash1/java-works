//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Implementation {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;
        person.gender = "Male";
        person.address = "123 Main Street, Anytown, CA, 12345, USA";
        person.contactDetails = "1234567890";
        person.personId = 1;

        System.out.println(person.viewPersonalDetails());

        Patient patient = new Patient();
        patient.name = "John";
        patient.age = 25;
        patient.gender = "Male";
        patient.address = "123 Main Street, Anytown, CA, 12345, USA";
        patient.contactDetails = "1234567890";
        patient.patientId = 1;

        System.out.println(patient.viewPersonalDetails());

        Doctor doctor = new Doctor();
        doctor.name = "John";
        doctor.age = 25;
        doctor.gender = "Male";
        doctor.address = "123 Main Street, Anytown, CA, 12345, USA";
        doctor.contactDetails = "1234567890";
        doctor.doctorId = 1;
        doctor.department = "Surgery";

        System.out.println(doctor.viewPersonalDetails());

        Treatment treatment = new Treatment();
        treatment.type = "Surgery";
        treatment.description = "Surgery";
        treatment.doctor = doctor;
        treatment.treatmentId = 1;

        System.out.println(treatment.viewTreatmentDetails());
        treatment.updateDescription();

        Appointment appointment = new Appointment();
        appointment.appointmentDate = "2020-01-01";
        appointment.appointmentTime = 123456;
        appointment.patient = patient;
        appointment.appointmentId = 1;

        System.out.println(appointment.viewAppointmentDetails());
        appointment.rescheduleAppointment();
        System.out.println(appointment.viewAppointmentDetails());
    }
}
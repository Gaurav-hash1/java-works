public class Doctor extends Person{
    public int doctorId;
    public String department;
    public Patient patient;
    public Treatment treatment;

    /**
     * See the patient details
     */
    public void seePatientDetails(){
        System.out.println(patient.viewPersonalDetails());
    }

    /**
     * Prescribe the treatment
     */
    public void prescribeTreatment(){
        System.out.println("Prescribed treatment");
    }
}

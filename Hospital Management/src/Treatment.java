public class Treatment {
    public int treatmentId;
    public String type;
    public String description;
    public Doctor doctor;

    /**
     * Update the treatment description
     */
    public void updateDescription(){
        System.out.println("Updated treatment");
    }

    /**
     *
     * @return the treatment details
     */
    public String viewTreatmentDetails(){
        doctor.prescribeTreatment();
        return "Type: " + type + "\n" +
                "Description: " + description + "\n" +
                "Doctor: " + doctor.name;
    }
}

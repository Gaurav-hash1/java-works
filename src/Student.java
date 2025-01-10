public class Student extends Person{
    public int studentNumber;
    public double averageMarks;
    /**
     * Check if the student is eligible to enroll in the course
     * @return true if eligible, false otherwise
     */
    public boolean isEligibleToEnroll(){
        return true;
    }
    public int getSeminarstaken(){
        return 0;
    }
}

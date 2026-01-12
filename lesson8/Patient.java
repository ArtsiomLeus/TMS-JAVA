package lesson8;

public class Patient {
    private String name;
    private Doctor doctor;
    private int treatmentPlan;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}

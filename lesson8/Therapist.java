package lesson8;

public class Therapist extends Doctor {

    public Therapist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        System.out.println("Терапевт " + getName() + " осмаривает и назначает лечение");
    }
    public void assignDoctor (Patient patient) {
        int treatmentPlan = patient.getTreatmentPlan();

        if (treatmentPlan == 1) {
            patient.setDoctor(new Surgeon("Врач Петров"));
            System.out.println("Назначен хирург " + patient.getName());
        } else if (treatmentPlan == 2) {
            patient.setDoctor(new Dentist("Врач Иванов"));
            System.out.println("Назначен дантист " + patient.getName());
        } else {
            patient.setDoctor(this);
            System.out.println("Назначен терапевт " + patient.getName());
        }
        patient.getDoctor().treat();
    }
}

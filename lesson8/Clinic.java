package lesson8;

public class Clinic {
    public static void main (String[] args) {
        Therapist therapist = new Therapist("Сидоров");
        Patient patient1 = new Patient("Артем Л");
        patient1.setTreatmentPlan(1);

        Patient patient2 = new Patient("Мария Н");
        patient2.setTreatmentPlan(2);

        Patient patient3 = new Patient("Власлав Х");
        patient3.setTreatmentPlan(3);

        System.out.println("Пациент 1:");
        therapist.assignDoctor(patient1);
        System.out.println();

        System.out.println("Пациент 2:");
        therapist.assignDoctor(patient2);
        System.out.println();

        System.out.println("Пациент 3:");
        therapist.assignDoctor(patient3);
    }
}

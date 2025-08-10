package day4;
//5.	 Create practice on this Create a superclass Hospital with a hospital name and a method to display it. Extend it with a subclass Patient that stores the patient’s name, sets it via constructor, and displays patient details along with hospital name. In main(), create a Patient object and show its details.


class Hospital {
    String hospitalName = "City General Hospital";
    void showHospitalInfo() {
        System.out.println("Hospital Name: " + hospitalName);
    }
}

public class Patient extends Hospital {
    String patientName;
    public Patient(String patientName) {
        this.patientName = patientName;
    }
    void showPatientDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Treated at: " + hospitalName);
    }

    public static void main(String[] args) {
        Patient p = new Patient("Amit");
        p.showPatientDetails();
    }
}

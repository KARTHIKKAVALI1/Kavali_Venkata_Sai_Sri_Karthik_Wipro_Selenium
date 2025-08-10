package day4;

//3.Create Hospital super class and access this class inside the patient child class and access properties from Hospital class
class Hospital {
 protected String hospitalName;
 protected String location;
 protected int totalBeds;

 public Hospital(String name, String city, int beds) {
     this.hospitalName = name;
     this.location = city;
     this.totalBeds = beds;
 }

 public String getHospitalInfo() {
     return hospitalName + " located in " + location + " with " + totalBeds + " beds.";
 }
}

class Patient extends Hospital {
 private String patientName;
 private int patientAge;

 public Patient(String hName, String city, int beds, String pName, int pAge) {
     super(hName, city, beds); // Pass to Hospital constructor
     this.patientName = pName;
     this.patientAge = pAge;
 }

 public String getFullDetails() {
     return "Patient: " + patientName + " (Age: " + patientAge + "), admitted at " +
            hospitalName + " in " + location + ". " +
            "Hospital Capacity: " + totalBeds + " beds.";
 }
}

public class HospitalSuperClass {
 public static void main(String[] args) {
     Patient p1 = new Patient("City Care Hospital", "Hyderabad", 250, "Rajesh Kumar", 42);

     System.out.println("Hospital Info: " + p1.getHospitalInfo());

     System.out.println("Patient Details: " + p1.getFullDetails());
 }
}

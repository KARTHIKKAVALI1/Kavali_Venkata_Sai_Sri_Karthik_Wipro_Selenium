package day4;

// 5.	Create Hierarchical inheritance of hospital
class HospitalBase {
    String hospitalName = "City Care Hospital";

    void showHospitalInfo() {
        System.out.println("Hospital Name: " + hospitalName);
    }
}

// First level subclasses of HospitalBase
class DoctorSpecialist extends HospitalBase {
    void doctorInfo() {
        System.out.println("Doctors available: Gynac, Endo, Cardiac specialists");
    }
}

class NurseStaff extends HospitalBase {
    void nurseInfo() {
        System.out.println("Nurses provide patient care");
    }
}

class AccountantStaff extends HospitalBase {
    void accountantInfo() {
        System.out.println("Accountant handles payments and documentation");
    }
}

// Second level subclasses of DoctorSpecialist
class GynacDoctor extends DoctorSpecialist {
    void speciality() {
        System.out.println("Gynaecologist - specializes in women's health");
    }
}

class EndoDoctor extends DoctorSpecialist {
    void speciality() {
        System.out.println("Endocrinologist - specializes in hormone-related treatments");
    }
}

class CardiacDoctor extends DoctorSpecialist {
    void speciality() {
        System.out.println("Cardiac specialist - deals with heart conditions");
    }
}

// Third level subclasses of CardiacDoctor
class CardiacOperation extends CardiacDoctor {
    void procedure() {
        System.out.println("Performs cardiac operations");
    }
}

class CardiacOPD extends CardiacDoctor {
    void service() {
        System.out.println("Handles cardiac outpatient department (OPD) consultations");
    }
}

// Second level subclasses of AccountantStaff
class PaymentsHandler extends AccountantStaff {
    void handlePayments() {
        System.out.println("Manages hospital payments and billing");
    }
}

class DocumentationHandler extends AccountantStaff {
    void handleDocumentation() {
        System.out.println("Maintains hospital records and documentation");
    }
}

public class HospitalHierarchyTest {
    public static void main(String[] args) {
        // Create HospitalBase object
        HospitalBase hospital = new HospitalBase();
        hospital.showHospitalInfo();

        // DoctorSpecialist branch demonstration
        DoctorSpecialist doctor = new DoctorSpecialist();
        doctor.doctorInfo();

        GynacDoctor gynac = new GynacDoctor();
        gynac.speciality();

        EndoDoctor endo = new EndoDoctor();
        endo.speciality();

        CardiacDoctor cardiac = new CardiacDoctor();
        cardiac.speciality();

        CardiacOperation operation = new CardiacOperation();
        operation.procedure();

        CardiacOPD opd = new CardiacOPD();
        opd.service();

        // NurseStaff branch demonstration
        NurseStaff nurse = new NurseStaff();
        nurse.nurseInfo();

        // AccountantStaff branch demonstration
        AccountantStaff accountant = new AccountantStaff();
        accountant.accountantInfo();

        PaymentsHandler payments = new PaymentsHandler();
        payments.handlePayments();

        DocumentationHandler documentation = new DocumentationHandler();
        documentation.handleDocumentation();
    }
}

package day4;

// 4.	Create Hierarchical inheritance
class After12th {
    void showOptions() {
        System.out.println("Options after 12th:");
    }
}

class Engineering extends After12th {
    void listBranches() {
        System.out.println("Engineering branches: IT, Mechanical, CS");
    }
}

class Medical extends After12th {
    void listBranches() {
        System.out.println("Medical branches: MBBS, BDS");
    }
}

class OtherCourses extends After12th {
    void listBranches() {
        System.out.println("Other courses: BBA, BCA");
    }
}

class IT extends Engineering {
    void show() {
        System.out.println("You selected Engineering -> IT");
    }
}
class Mechanical extends Engineering {
    void show() {
        System.out.println("You selected Engineering -> Mechanical");
    }
}
class CS extends Engineering {
    void show() {
        System.out.println("You selected Engineering -> Computer Science");
    }
}

class MBBS extends Medical {
    void show() {
        System.out.println("You selected Medical -> MBBS");
    }
}
class BDS extends Medical {
    void show() {
        System.out.println("You selected Medical -> BDS");
    }
}

class BBA extends OtherCourses {
    void show() {
        System.out.println("You selected Other Courses -> BBA");
    }
}
class BCA extends OtherCourses {
    void show() {
        System.out.println("You selected Other Courses -> BCA");
    }
}

public class After12thTest {
    public static void main(String[] args) {

    	System.out.println("Created Hierarchical inheritance: ");
    	System.out.println();
    	After12th root = new After12th();
        root.showOptions();

        Engineering engg = new Engineering();
        engg.listBranches();

        IT it = new IT();
        it.show();

        Mechanical mech = new Mechanical();
        mech.show();

        CS cs = new CS();
        cs.show();

        Medical med = new Medical();
        med.listBranches();

        MBBS mbbs = new MBBS();
        mbbs.show();

        BDS bds = new BDS();
        bds.show();

        OtherCourses oc = new OtherCourses();
        oc.listBranches();

        BBA bba = new BBA();
        bba.show();

        BCA bca = new BCA();
        bca.show();
    }
}

package day7;

//7.	Create a program to show that Java is strictly "call by value" even when passing objects (object references are passed by value).
class DemoObject {
    int value;

    DemoObject(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DemoObject[value=" + value + "]";
    }
}

public class callByValueStrictly {
    
    static void modifyObject(DemoObject obj) {
        obj.value = 100;  // Changes object state
    }

    
    static void reassignObject(DemoObject obj) {
        obj = new DemoObject(200); // Reassign local copy of reference
    }

    public static void main(String[] args) {
        DemoObject myObj = new DemoObject(50);
        System.out.println("Before modifyObject: " + myObj);

        modifyObject(myObj);
        System.out.println("After modifyObject: " + myObj);

        reassignObject(myObj);
        System.out.println("After reassignObject: " + myObj);
    }
}

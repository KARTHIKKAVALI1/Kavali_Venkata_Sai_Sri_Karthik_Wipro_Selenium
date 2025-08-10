package day4;
// 1.	create multilevel inheritance for
//Vehicle
//Four_wheeler
//Petrol_Four_Wheeler
//FiveSeater_Petrol_Four_Wheeler
//Baleno_FiveSeater_Petrol_Four_Wheeler


class Vehicle {
    void showType() {
        System.out.println("Generic Vehicle");
    }
}

class FourWheeler extends Vehicle {
    void showWheels() {
        System.out.println("four wheeler");
    }
}

class PetrolFourWheeler extends FourWheeler {
    void showFuelType() {
        System.out.println("Runs on petrol");
    }
}

class FiveSeaterPetrolFourWheeler extends PetrolFourWheeler {
    void seatingCapacity() {
        System.out.println("Five-seater configuration");
    }
}

public class BalenoFiveSeaterPetrolFourWheeler extends FiveSeaterPetrolFourWheeler {
    void showBrand() {
        System.out.println("This is a Maruti Suzuki Baleno.");
    }

    public static void main(String[] args) {
        BalenoFiveSeaterPetrolFourWheeler baleno = new BalenoFiveSeaterPetrolFourWheeler();
        baleno.showType();
        baleno.showWheels();
        baleno.showFuelType();
        baleno.seatingCapacity();
        baleno.showBrand();
    }
}

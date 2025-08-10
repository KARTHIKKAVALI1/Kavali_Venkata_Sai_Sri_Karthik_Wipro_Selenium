package day4;
// poly 3. 3.	Create a Bank class with a method getInterestRate()   
/*create subclasses:                                         
SBI ->return 6.7%                                          
ICICI ->return 7.0%                                       
HDFC -> return 7.5%*/
class Bank {
    double getInterestRate() { 
    	return 0.0; 
    	}
}
class SBI extends Bank {
    double getInterestRate() { 
    	return 6.7; 
    	}
}
class ICICI extends Bank {
    double getInterestRate() { 
    	return 7.0; 
    	}
}
class HDFC extends Bank {
    double getInterestRate() { 
    	return 7.5; 
    	}
}

public class BankTest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate());
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate());
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate());
    }
}

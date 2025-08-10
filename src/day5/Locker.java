package day5;

//. Inner Class Encapsulation: Secure Locker
//Encapsulate helper logic inside the class.
//•	Implement a class Locker with private fields such as lockerId, isLocked, and passcode.
//•	Use an inner private class SecurityManager to handle passcode verification logic.
//•	Only expose public methods: lock(), unlock(String code), isLocked().
//•	Password attempts should not leak verification logic externally—only success/failure.
//•	Ensure no direct access to passcode or the inner SecurityManager from outside.

public class Locker {
    private String lockerId;
    private boolean isLocked;
    private String passcode;
    private SecurityManager securityManager;

    private class SecurityManager {
        private int failedAttempts;
        private static final int MAX_ATTEMPTS = 3;
        public boolean verifyPasscode(String inputCode) {
            if (failedAttempts >= MAX_ATTEMPTS) return false;
            if (passcode.equals(inputCode)) {
                failedAttempts = 0;
                return true;
            } else {
                failedAttempts++;
                return false;
            }
        }
        public void resetAttempts() { failedAttempts = 0; }
    }

    public Locker(String lockerId, String passcode) {
        this.lockerId = lockerId;
        this.passcode = passcode;
        this.isLocked = true;
        this.securityManager = new SecurityManager();
    }
    public void lock() {
        isLocked = true;
        System.out.println("Locker " + lockerId + " is now locked.");
    }
    public boolean unlock(String code) {
        if (!isLocked) return true;
        if (securityManager.verifyPasscode(code)) {
            isLocked = false;
            System.out.println("Locker " + lockerId + " unlocked successfully.");
            return true;
        } else {
            System.out.println("Invalid passcode for locker " + lockerId);
            return false;
        }
    }
    public boolean isLocked() { return isLocked; }
    public static void main(String[] args) {
        Locker locker = new Locker("L001", "1234");
        System.out.println("Is locked: " + locker.isLocked());
        locker.unlock("wrong");
        locker.unlock("1234");
        System.out.println("Is locked: " + locker.isLocked());
        locker.lock();
        System.out.println("Is locked: " + locker.isLocked());
    }
}

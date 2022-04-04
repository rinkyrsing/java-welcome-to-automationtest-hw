package automationtest;

public class IfThenElse_Q3 {

    public static void main(String[] args) {
        // Calling instance method
        IfThenElse_Q3 obj = new IfThenElse_Q3();
        obj.isTeen(15 );
        obj.isTeen(25);

    }

    // Return type method with parameter
    public boolean isTeen(int age) {
        if (age <= 18) {
            System.out.println("True");
        } else if (age >= 18) {
            System.out.println("False");
        }
        return false;
    }
}

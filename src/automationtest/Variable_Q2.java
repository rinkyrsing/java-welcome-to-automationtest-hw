package automationtest;

public class Variable_Q2 {

    // Instance Variable
    int id;
    String name;

    public static void main(String[] args) {

        Variable_Q2 obj1 = new Variable_Q2( 101, " Rinmy");
        obj1.display();
        Variable_Q2 obj2 = new Variable_Q2(102, " Prime");
        obj2.display();
    }
    // Constructor with parameter
    Variable_Q2( int id, String name) {
        this.id = id;
        this.name = name;

    }
    // Instance Variable
    public void display() {

        System.out.println( id + name);
    }
}

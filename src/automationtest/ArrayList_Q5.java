package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {
        // Declaring the array list
        ArrayList<String> tools = new ArrayList();
        tools.add("Scrum");
        tools.add("Java");
        tools.add("Jira");
        tools.add("Selenium");
        tools.add("Cucumber");
        tools.add("Postman");
        tools.add("Rest Assured");

        //Printing with the help of forEach
        for (String testing : tools)
        {
            System.out.println(testing);
        }
    }
}

package Method;

public class Employee {


    // instance method with void type dont use static keyword
    public void getEmployeeDetails2() {
        System.out.println("Welcome instance method");


    }

    // instane method without void type dont use static keyword
    public String getEmployeeDetails3() {
        String str = "Welcome instance method in string";
        return str;
    }

    // static method with return type
    public static void getEmployeeDetails() {
        System.out.println("Welcome static method");

    }

    // static method without return type
    public static String getEmployeeDetails1() {
        String str = "This is return statement";
        return str;
    }

}

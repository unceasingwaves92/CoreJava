package Method;

public class EmployeeMethod {

    // static variable
    public static final String ORG_NAME="TCS";

    // Instance variable
    public int empId=1;

    // static variable call inside static method
    public static void getEmployeeDetails() {
        // static variable we can call as static method
        // static method we can call as static variable
        // Inside static method we can call static variable not instance variable
        System.out.println(EmployeeMethod.ORG_NAME);
        // Instance varaible we can call as static method
        EmployeeMethod emp= new EmployeeMethod();
        System.out.println(emp.empId);
    }

    // Instance variable call inside instance method
    public void getEmployeeDetails1() {
        // Instance method we can call instance variable
        // Instance variable we can call instance method
        EmployeeMethod emp= new EmployeeMethod();
        System.out.println(emp.empId);
        // static variable we can call inside instance method
        // Instance method we can call static variable
        System.out.println(EmployeeMethod.ORG_NAME);
    }

}

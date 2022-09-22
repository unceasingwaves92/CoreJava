package Method;

public class Main {


    public static void main(String[] args) {

        // instance method at the time of creating space when creating object
        Employee emp = new Employee();
        emp.getEmployeeDetails2();
        // res1 somewhere use in local variable
        String res1 = emp.getEmployeeDetails3();
        System.out.println(res1);

        // Invoke main method from static method in local variable
        String res = Employee.getEmployeeDetails1();
        System.out.println(res);
        // Invoke main method from static method at void return type no need to given sop
        Employee.getEmployeeDetails();

        Calculator cal = new Calculator();
        int respadd = cal.add(5, 5);
        System.out.println("The value of add: "+respadd);

        int respSum = cal.sum(50,20);
        System.out.println("The value of sum: "+respSum);

        int respmul = cal.mul(20,20);
        System.out.println("The value of mul: "+respmul);

        int respdiv = cal.div(20,20);
        System.out.println("The value of div: " +respdiv);

        int respmod = cal.mod(10,5);
        System.out.println("The value of mod: "+respmod);

        cal.addReturn(50,50);
    }
}

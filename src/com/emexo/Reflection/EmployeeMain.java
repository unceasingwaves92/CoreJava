package com.emexo.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee();
        try {
            Class cls = employee.getClass();

            // access private variable
            Field field = cls.getDeclaredField("empId");
            field.setAccessible(true);
            field.set(employee, 3);
            System.out.println(field.get(employee));

            // access private method
            Method method = cls.getDeclaredMethod("getEmployee");
            method.setAccessible(true);
            method.invoke(employee);

            // access public method with parameter
            Method method1 = cls.getDeclaredMethod("getOrgDetails", int.class);
            method1.invoke(employee, 10);

            // examine the behaviour of the class
            // get the method names
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Get method names");
            for(Method m:methods){
                System.out.println(m.getName());
            }

            // get the constructor names
            Constructor[] constructors = cls.getConstructors();
            System.out.println("Get constructor names");
            for(Constructor constructor: constructors){
                System.out.println(constructor.getName());
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

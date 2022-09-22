package com.emexo.ConstructorExample;

public class Organization {



        // Instance variable
        public int empId;
        public String empName;
        public boolean empDob;
        public long empHeight;

        private Salary salary;

        // Instance method
        public Organization(int id, String name, boolean dob, long Height, Salary salary){

            this.empId = id;
            this.empName = name;
            this.empDob = dob;
            this.empHeight = Height;
            this.salary = salary;
        }

        // Print instance method
        public void getOrgDetails()
        {
            System.out.println(empId + ":" + empName + ":" + empDob + ":" + empHeight);
            salary.getSalaryDetails();
        }

    }



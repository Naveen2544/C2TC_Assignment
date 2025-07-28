package com.NavaneethaKrishnan_TM.Assignment_1;
import com.NavaneethaKrishnan_TM.Assignment_1.Employee.Manager;
import com.NavaneethaKrishnan_TM.Assignment_1.Employee.Developer;
import com.NavaneethaKrishnan_TM.Assignment_1.Utility.Employee_Utility;



public class Assignment_Main {
    public static void main(String[] args) {

        Manager mgr = new Manager("Naveenth", 1001, 85000, "Operations");
        Developer dev = new Developer("Nava", 1002, 70000, "Java");

        System.out.println("📋 Manager Details:");
        Employee_Utility.printEmployeeDetails(mgr);

        System.out.println("📋 Developer Details:");
        Employee_Utility.printEmployeeDetails(dev);
    }
}

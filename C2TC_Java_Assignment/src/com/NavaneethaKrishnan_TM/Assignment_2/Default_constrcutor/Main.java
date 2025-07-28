package com.NavaneethaKrishnan_TM.Assignment_2.Default_constrcutor;

public class Main {
    public static void main(String[] args) {
        Student StudentObj = new Student();      // Calls default constructor

        Commission emp = new Commission();
        emp.setDetails("Naveen", "Chennai", "9876543210", 85000);  // Set values directly
        emp.calculateCommission();               // Calculate & display commission
    }
}

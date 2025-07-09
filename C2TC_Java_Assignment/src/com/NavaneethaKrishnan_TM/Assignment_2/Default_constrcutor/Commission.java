package com.NavaneethaKrishnan_TM.Assignment_2.Default_constrcutor;

public class Commission {
    String name, address, phone;
    double salesAmount;

    // New method to set details (instead of using Scanner)
    public void setDetails(String name, String address, String phone, double salesAmount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salesAmount = salesAmount;
    }

    public void calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }

        System.out.println("\n--- Commission Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Address     : " + address);
        System.out.println("Phone       : " + phone);
        System.out.println("Sales Amount: ₹" + salesAmount);
        System.out.println("Commission  : ₹" + commission);
    }
}
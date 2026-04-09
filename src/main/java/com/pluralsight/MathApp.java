package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Exercise 3: Step 1

        //Question 1: Salary for Bob and Gary
        double bobSalary = 325678.99;
        double garySalary = 747321.89;

        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is: $" + String.format("%.2f", highestSalary));

        //Question 2: Lowest price between car and truck
        double carPrice = 45789.00;
        double truckPrice = 83947.99;

        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is: $" + String.format("%.2f", lowestPrice));


        //Question 3: Area of a circle with radius 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + String.format("%.2f", area) + " square meters");


        //Question 4: Square root of 5.0
        double number = 5.00;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of " + number + " is: " + String.format("%.2f", squareRoot));


        //Question 5: Distance between the points(5,10) and (85,50)
        double x1 = 5.00;
        double y1 = 10.00;
        double x2 = 85.00;
        double y2 = 50.00;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between the points is: " + String.format("%.2f", distance));


        //Question 6: The absolute value of -3.8
        double absoluteValueOf = -3.8;
        double absoluteValue = Math.abs(absoluteValueOf);
        System.out.println("The absolute value of " + absoluteValueOf + " is: " + absoluteValue);


        //Question 7: random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("The random number between 0 and 1 is: " + randomNumber);


        //Question 8: Minutes in 24 days
        int days = 24;
        int minutesInOneDay = 60  * 24;
        int minutesIn24Days = days * minutesInOneDay;
        int secondsIn24Days = minutesIn24Days * 60;
        int milliSecondsIn24Days = secondsIn24Days * 1000;

        System.out.println("The number of minutes in " + days + " days is: " + minutesIn24Days + " minutes");
        System.out.println("The number of milliseconds in " + days + " days is: " + milliSecondsIn24Days + " milliseconds");



    }
}

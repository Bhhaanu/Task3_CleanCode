package org.epam;

import java.util.Scanner;

public class Client_Cost_Estimation {
    public static void main(String[] args) throws StandardInvalidException {
        int standard;
        double area;
        System.out.println("----MENU----");
        System.out.println("1.1200 :use standard materials");
        System.out.println("2.1500 :use above standard materials");
        System.out.println("3.1800 :use high standard materials");
        System.out.println("4.2500 :use high standard materials and fully automated home");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter standard you need in range 1 to 4");
        standard=input.nextInt();
        System.out.println("Area of the house is:");
        area=input.nextDouble();
        Cost_per_sqft cps=new Cost_per_sqft();
        System.out.println("Cost estimated is:"+cps.cost_estimator(standard,area));
    }
}

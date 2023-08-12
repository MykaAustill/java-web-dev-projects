package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of miles you have driven ");
        double numMiles = input.nextDouble();

        System.out.print("Enter the amount of gas you have used in gallons: ");
        double numHours = input.nextDouble();

        double mpg  = numMiles/numHours;

        System.out.println("You are running on " + mpg + " mpg.");

    }
}

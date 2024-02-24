/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
//import assignment2.Airplane; // THIS IMPORT ONLY WORKS FOR PROJECTSTEM. 

public class Assignment2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane("AAA02", 15.8, 128, 30000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
        String callSign = scanner.nextLine().toUpperCase();
        double distance = scanner.nextDouble();
        int bearing = scanner.nextInt();
        int altitude = scanner.nextInt();
        Airplane plane3 = new Airplane(callSign, distance, bearing, altitude);

        System.out.println("\nInitial Positions:");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("\"Airplane 3\": " + plane3.toString());

        System.out.println("\nInitial Distances:");
        double dist12 = plane1.distTo(plane2);
        double dist13 = plane1.distTo(plane3);
        double dist23 = plane2.distTo(plane3);
        System.out.printf("The distance between Airplane 1 and Airplane 2 is %.2f miles.%n", dist12);
        System.out.printf("The distance between Airplane 1 and Airplane 3 is %.2f miles.%n", dist13);
        System.out.printf("The distance between Airplane 2 and Airplane 3 is %.2f miles.%n", dist23);

        System.out.println("\nInitial Height Differences:");
        int height12 = Math.abs(plane1.getAlt() - plane2.getAlt());
        int height13 = Math.abs(plane1.getAlt() - plane3.getAlt());
        int height23 = Math.abs(plane2.getAlt() - plane3.getAlt());
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + height12 + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + height13 + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + height23 + " feet.");

        plane1.move(dist23, 65);
        plane2.move(8.0, 135);
        plane3.move(5.0, 55);
        plane1.gainAlt();
        plane2.loseAlt();
        plane3.loseAlt();

        System.out.println("\nNew Positions:");
        System.out.println("\"Airplane 1\": " + plane1.toString());
        System.out.println("\"Airplane 2\": " + plane2.toString());
        System.out.println("\"Airplane 3\": " + plane3.toString());

        System.out.println("\nNew Distances:");
        dist12 = plane1.distTo(plane2);
        dist13 = plane1.distTo(plane3);
        dist23 = plane2.distTo(plane3);
        System.out.printf("The distance between Airplane 1 and Airplane 2 is %.2f miles.%n", dist12);
        System.out.printf("The distance between Airplane 1 and Airplane 3 is %.2f miles.%n", dist13);
        System.out.printf("The distance between Airplane 2 and Airplane 3 is %.2f miles.%n", dist23);

        System.out.println("\nNew Height Differences:");
        height12 = Math.abs(plane1.getAlt() - plane2.getAlt());
        height13 = Math.abs(plane1.getAlt() - plane3.getAlt());
        height23 = Math.abs(plane2.getAlt() - plane3.getAlt());
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + height12 + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + height13 + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + height23 + " feet.");
        
        scanner.close();
    }
}
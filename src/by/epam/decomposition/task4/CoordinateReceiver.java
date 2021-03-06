package by.epam.decomposition.task4;

import java.util.Scanner;

public class CoordinateReceiver {
    private double coordinate;
    private Scanner input = new Scanner(System.in);

    public CoordinateReceiver() {
    }

    public double receiveCoordinate(String str) {
        System.out.println(str);
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                return this.coordinate = input.nextDouble();
            } else {
                System.out.println("Incorrect number entry.Please re-enter ");
                input.next();
            }
        }
        return this.coordinate;
    }
}



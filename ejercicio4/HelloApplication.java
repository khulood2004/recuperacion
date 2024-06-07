package com.example.ejercicio4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sequence of steps separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");

        int[] steps = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            steps[i] = Integer.parseInt(input[i]);
        }

        double[] finalCoordinates = calculateFinalCoordinates(steps);
        System.out.println("Final coordinates of the robot: (x: " + finalCoordinates[0] + ", y: " + finalCoordinates[1] + ")");

        scanner.close();
    }

    public static double[] calculateFinalCoordinates(int[] steps) {
        double x = 0;
        double y = 0;
        boolean onYAxis = true;

        for (int step : steps) {
            double angle = onYAxis ? Math.PI / 2 : 0;
            x += step * Math.cos(angle);
            y += step * Math.sin(angle);
            onYAxis = !onYAxis;
        }

        return new double[]{x, y};
    }
}

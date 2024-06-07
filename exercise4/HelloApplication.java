package org.example.exercise4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {

    public static void main(String[] args) {
        int[] stepsRobot = {2, 3,4,5};

        int x = 0;
        int y = 0;

        for (int i = 0; i < stepsRobot.length; i++) {
            if (i == 2) {
                y = y - stepsRobot[i];
            } else if (i == 0) {
                y = y + stepsRobot[i];
            } else {
                x = x - stepsRobot[i];
            }
        }
        System.out.println("Final coordinates: (x: " + x + ", y: " + y + ")");
    }
}


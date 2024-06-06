package com.example.ejercicio3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter player 1's move (R, P, or S): ");
        String player1 = scanner.nextLine();

        System.out.println("Enter player 2's move (R, P, or S): ");
        String player2 = scanner.nextLine();

        if (player1.equals(player2)) {
            System.out.println("It's a Tie");
        } else if ((player1.equals("R") && player2.equals("S")) ||
                (player1.equals("P") && player2.equals("R")) ||
                (player1.equals("S") && player2.equals("P"))) {
            System.out.println("Player 1 ");
        } else {
            System.out.println("Player 2 ");
        }
    }
}



package com.example.exercise3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1Wins = 0;
        int player2Wins = 0;

        for (int round = 1; round <= 3; round++) {
            System.out.println("Round " + round);
            System.out.println("Enter player 1's move (R, P, or S): ");
            String player1 = scanner.nextLine().toUpperCase();

            System.out.println("Enter player 2's move (R, P, or S): ");
            String player2 = scanner.nextLine().toUpperCase();

            if (player1.equals(player2)) {
                System.out.println("It's a Tie");
            } else if ((player1.equals("R") && player2.equals("S")) ||
                    (player1.equals("P") && player2.equals("R")) ||
                    (player1.equals("S") && player2.equals("P"))) {
                System.out.println("Player 1 wins this round");
                player1Wins++;
            } else {
                System.out.println("Player 2 wins this round");
                player2Wins++;
            }
        }

        if (player1Wins > player2Wins) {
            System.out.println("Player 1 is the overall winner");
        } else if (player2Wins > player1Wins) {
            System.out.println("Player 2 is the overall winner");
        } else {
            System.out.println("The game ends in a tie!");
        }
    }
}
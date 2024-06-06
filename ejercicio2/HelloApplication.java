package com.example.ejercicio2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number>0){
            for(int i=1; i<=number;i++){
                for(int j=i;j<number;j++){
                    System.out.print(" ");
                }
                System.out.print("_|");
                System.out.println();
            }
        }
        if(number<0){
            for(int i=number; i<=1;i++){
                for(int j=number;j<i;j++){
                    System.out.print(" ");
                }
                System.out.print("|_");
                System.out.println();
            }
        }
        if (number == 0) {
            System.out.println("__");
        }
    }
}
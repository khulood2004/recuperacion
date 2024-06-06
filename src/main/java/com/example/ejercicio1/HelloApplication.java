package com.example.ejercicio1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        Scanner scannr = new Scanner(System.in);
        for (int i=1;i<=100;i++){
            System.out.println("Th numbers are: "+i);
            if(i % 3 == 0){
                System.out.println("fizz: "+i);

            }
            if(i % 5 == 0){
                System.out.println("buzz: "+i);

            }
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("fizzbuzz: "+i);

            }

        }

    }
}
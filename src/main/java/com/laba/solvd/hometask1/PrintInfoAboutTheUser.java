package com.laba.solvd.hometask1;

import java.util.Scanner;

public class PrintInfoAboutTheUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String Name = scanner.nextLine();
        System.out.println("Enter Surname");
        String Surname = scanner.nextLine();
        System.out.println("Hello! Nice to see you" + ' ' + Name + ' ' + Surname + "!");


    }
}
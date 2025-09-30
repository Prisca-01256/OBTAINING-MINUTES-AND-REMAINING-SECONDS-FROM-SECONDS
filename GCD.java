/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.prisca;

import java.util.Scanner;

/**
 *
 * @author VU-STUDENT
 */
public class GCD {
   
    public static void main(System[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the first positive integer:");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second positive integer:");
        int num2 = scanner.nextInt();
        //ensure that the numbers entered are positive
        if (num1<=0 || num2 <= 0){
        System.out.println("Both numbers must be positive.");
        return;
    }
        //finding the gratest common divisor using Euclidean algorithm
        int gcd = gcd(num1 ,num2);
        System.out.print("The Greatest Common Divisorof " + num1 +" and " + num2 +" is: " + gcd);
    }
    //Method to calculate the GCD using the Euclidean algorithm
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
} 

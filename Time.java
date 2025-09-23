/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.myage;

/**
 *
 * @author VU-STUDENTS
 */
import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
    Scanner save = new Scanner(System.in);
    final int PER_MINUTE= 60;
    System.out.println("Enter the value of seconds spent");
    int secondsSpent = save.nextInt();
   int minutes = secondsSpent / PER_MINUTE;
   int remainingSeconds = secondsSpent % PER_MINUTE;
    System.out.println("The Minutes for  " + secondsSpent + "seconds is:");
   System.out.println(minutes + " Minutes and " + remainingSeconds + " seconds");
   
}
}

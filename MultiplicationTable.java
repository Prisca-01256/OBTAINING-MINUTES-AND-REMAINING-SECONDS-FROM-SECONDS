/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.prisca;


public class MultiplicationTable {

    public static void main(String[] args) {
        
        
        // setting the size of the table to run from 0-12
        int size = 12;
                //outer loop for rows
                for(int r = 0; r <= size; r++){
        //inner loop for columns
                    for(int c = 0; c<= size; c++){
                        //print the product of r and c
                        System.out.print(r * c + "\t");
                    }
                    //move to next line after each row
                    System.out.println();
                }
                
    }
}                       

       
    

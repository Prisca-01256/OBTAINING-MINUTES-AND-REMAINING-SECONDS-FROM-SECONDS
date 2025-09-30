/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.marks;

/**
 *
 * @author VU-STUDENT
 */
public class MARKS {

    public static void main(String[] args) {
        
        int[] marks = {10,15,20,25,30,35,40,45,50,5560,65,70,75,80,85,90,95,100};
        
        int summation = marks[8]+marks[6];
        System.out.println(summation);
        
        int total = 0;
        for (int i = 0; i < marks.length;i++){
            total+= marks[i];
        }
        System.out.println("Total is "+total);
        
        int max = marks[0];
        for(int j = 1; j < marks.length; j++){
            if(marks[j] > max){
                max = marks[j];
            }
        }
        System.out.println("The maximum value in the array is "+ max);  
        
    }
}

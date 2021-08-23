
package javaapplication16;

import java.util.Scanner;


public class JavaApplication16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        
        double[]number= new double[10];
        double sum = 0;
        for(int i =0;i<10;i++){
        number[i]=input.nextInt();}
        
        for( int i=0;i<number.length;i++){
        sum = sum + number[i];}
         System.out.println("result of sum "+sum);
        double avg= sum/number.length;
        System.out.println("Average is :"+avg);
                 
                 
                 
                 
        
        
        
        
    }
    
}

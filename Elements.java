/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elements;

import java.util.Random;

//<Elements> -- Generate random numbers using recursion
//CSIS 312-B01
////<Citations> Deitel, P., & Deitel, H. (2018). 
//Java How to Program . Retrieved June 16, 2019,from https://libertyonline.
//vitalsource.com/#/books/9780134763507/cfi/6/2!/4@0:0

/**
 *
 * @author Victoria
 */
public class Elements {
    
    public static void main(String[] args) {
        
         Random r = new Random();// gen's a random number
         
        int[] num = new int[100]; // integer array the size of 100
        
        System.out.println("Victoria Norwood - Assignment 6\n");
        
        System.out.println("Array of elements from 1 - 100\n");
        
        for (int i = 1; i<100; i++){
            num[i]= r.nextInt(100); // Random 1-100 inclusive             
        }
        printArray(num, 1);    
    }

    public static long printArray(int[] num, int ind){
        
        //Source Found In Book Java How to Program
        if (ind >= num.length){//base cases for the array
          System.out.println();
          return ind;
          
        //Source Found In Book Java How to Program
        }else{// recursion for the array
          System.out.print(num[ind]+" ");
          return printArray(num, ind + 1);
        }
    }    
}

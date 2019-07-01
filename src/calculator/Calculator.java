/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author sp16-bse-046
 */
public class Calculator {

   public static int add(int a,int b){
 
       return a+b;
   }
   
   public static int  Subtract(int a,int b){
 
       return a-b;
   }
   
   public static int div(int a,int b){
 
       return a/b;
   }
   
   public static int mul(int a,int b){
 
       return a*b;
   }
   
   public static int percent(int a,int b){
 
       return a*b;
   }
    public static void main(String[] args) {
        
        System.out.println("Addition of two nubers are = "+add(10,12));
        System.out.println("Subtraction of two nubers are = "+Subtract(10,12));
        System.out.println("Division of two nubers are = "+div(10,12));
        System.out.println("Multiplication of two nubers are = "+mul(10,12));



       
    }
    
}

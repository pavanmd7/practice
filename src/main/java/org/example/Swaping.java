package org.example;

public class Swaping {
    public static void main(String args[]){
        swapWithTemp();
        swapWithTemp1();
    }
    public static void swapWithTemp(){
        int x=8, y=2,temp;
        System.out.println("Before swap x = " + x + " " + "y = " + y);
        temp = x;
        x = y;
        y= temp;
        System.out.println("After swap x = " + x + " " + "y = " + y);
    }
    public static void swapWithTemp1(){
        int x=8, y=2,temp;
        System.out.println("Before swap x = " + x + " " + "y = " + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swap x = " + x + " " + "y = " + y);
    }
}

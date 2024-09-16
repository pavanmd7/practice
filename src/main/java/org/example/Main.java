package org.example;

import jdk.dynalink.beans.StaticClass;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            reverseWithFunction();
            reverse1();
            reverse2();
            reverse3();
        }
        public static void reverseWithFunction(){
            String str = "Pavan";
            StringBuilder builder = new StringBuilder();
            builder.append(str);
            String rev = builder.reverse().toString();
            System.out.println(rev);
        }

        public static void reverse1(){
            String str = "Pavan Shwetha";
            char chars[] = str.toCharArray();
            for(int i = chars.length-1; i>=0; i--){
                System.out.print(chars[i]);
            }
            System.out.println();
        }
    public static void reverse2(){
        String str = "Pavan Shwetha";
        for(int i = str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void reverse3(){
        String str = "Maneshwari", rev="";
        for(int i = str.length()-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println( "Enter an Integer:");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        if(num%2==0){
            System.out.println("The integer is even.");
        }
        else{
            System.out.println("The integer is odd.");
        }
    }
}

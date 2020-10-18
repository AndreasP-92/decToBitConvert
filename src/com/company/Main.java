package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to Calculate Binary to Decimal");
        System.out.println("Press 2 to Calculate Decimal to binary");

        boolean menuActive = true;

        int binOrDec = sc.nextInt();
        while(menuActive == true) {

            if (binOrDec == 1) {
                binaryToDec();
                menuActive = false;
            } else if (binOrDec == 2) {
                decToBinary();
                menuActive = false;
            }
            if (binOrDec > 2) {
                System.out.println("You entered an invalid number, try again");
                binOrDec = sc.nextInt();
            }
        }


    }
    public static void binaryToDec(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary you want to calculate to Decimal");
        String binaryString = sc.nextLine();
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println(decimal);
    }
    public static void decToBinary(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Decimal you want to calculate to Binary");
        int decimalInt = sc.nextInt();
        String decimalParse = Integer.toBinaryString(decimalInt);
        System.out.println(decimalParse);
    }
}

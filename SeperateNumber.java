package chapter2;

import java.util.Scanner;
public class SeperateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        System.out.print("Enter a number with 5 digits: ");
        number = input.nextInt();

        num1 = number/ 10000;
        num2 = (number % 10000) / 100;
        num3 = ((number % 10000) % 1000) / 100;
        num4 = (((number % 10000) % 1000) % 100) /10;
        num5 = (((number % 10000) % 1000) % 100) % 10;

        System.out.printf("%d%s%d%s%d%s%d%s%d%n", num1," ", num2," ", num3," ", num4," ", num5);
        System.out.printf("%d%s%d%s%d%s%d%s%d%n", num1, " ", num2, " ", num3, " ", num4, " ", num5);
    }
}

package org.development;

import java.util.*;

import static java.lang.Math.*;

public class NarcissisticNumber {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");


        int inputNumber = sc.nextInt();

        if (isNarcissistic(inputNumber))
            System.out.println(inputNumber + " is a narcissistic number.");
        else
            System.out.println(inputNumber + " is not a narcissistic number.");
    }

    static int countDigit(int num) {
        if (num == 0)
            return 0;
        return 1 + countDigit(num / 10);
    }

    static boolean isNarcissistic(int num) {

        int power = countDigit(num);
        int temp = num;
        int sum = 0;

        while (temp > 0) {

            sum += pow(temp % 10, power);

            temp = temp / 10;
        }

        return (num == sum);
    }
} 
package sda.basic.java.day1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.println("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

       boolean result;
       result = firstDigit > secondDigit ? true : false;
       System.out.println("If x is greater than y: " + result);

        result = firstDigit * 3 > secondDigit ? true : false;
        System.out.println("If x * 3 is greater than y: " + result);

        result = secondDigit++ < ++firstDigit && --firstDigit < secondDigit++ ? true : false;
        System.out.println("If y++ is smaller than ++x and --x  is smaller than y++: " + result);

        result = (firstDigit * secondDigit) % 2 == 0 ? true : false;
        System.out.println("If x * y is even: " + result);

    }
}

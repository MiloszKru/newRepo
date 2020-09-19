package sda.basic.java.day1;

import java.util.Scanner;

public class Ex2 {

    private final static float PI_VALUE = (float) Math.PI;


    public static void main(String[] args) {

        float diameter = getDiameterFromUser();
        float circumference = calculateCircumference(diameter);
        System.out.println("Circumference of a circle: " + circumference);
        float area = calculateArea(diameter);
        System.out.println("Area of a circle: " + area);


    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumference(float diameter) {

        return PI_VALUE * diameter;

    }

    private static float calculateArea(float diameter) {
        float r = diameter/2;
        return (float) (PI_VALUE * Math.pow(r, 2));
    }
}

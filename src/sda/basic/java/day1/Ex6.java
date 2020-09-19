package sda.basic.java.day1;

public class Ex6 {

    public static void main(String[] args) {

        printMultiplicationTable(6, 0, 5);
    }

    private static void printMultiplicationTable(int multiplier, int multiplicanMin, int multiplicandMax) {
        for (;multiplicanMin <= multiplicandMax; multiplicanMin++) {

            int result = multiplier * multiplicanMin;
            System.out.println(multiplier + " * " + multiplicanMin + " = " + result);
        }
    }
}

package Fundamentos;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double div = 5/9.0;
        final int sub = 32;
        System.out.println("Qual a temperatura em Fahrenheit?");
        double tempF = sc.nextDouble();
        double tempC = (tempF - sub) * div;
        System.out.printf("A temperatura em Celsius é: %.2f", tempC);
    }
}

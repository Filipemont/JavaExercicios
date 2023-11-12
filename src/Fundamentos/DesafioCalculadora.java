package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("Digite o operador");
        String operador = sc.next();

        double result;
        result = "+".equals(operador) ? num1 + num2 :0;
        result = "-".equals(operador) ? num1 - num2 :result;
        result = "*".equals(operador) ? num1 * num2 :result;
        result = "/".equals(operador) ? num1 / num2 :result;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, result);
        sc.close();
    }
}

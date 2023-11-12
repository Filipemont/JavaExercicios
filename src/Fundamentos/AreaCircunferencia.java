package Fundamentos;

import org.w3c.dom.ls.LSOutput;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;
        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI *Math.pow(raio,2);
        System.out.println("Area = "+ area+ "m2.");
    }
}

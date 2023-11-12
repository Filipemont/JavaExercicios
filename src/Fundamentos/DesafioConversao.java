package Fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salario1 = sc.nextLine().replace(",", ".");
        String salario2 = sc.nextLine().replace(",", ".");
        String salario3 = sc.nextLine().replace(",", ".");

        double primeiroSalario = Double.parseDouble(salario1);
        double segundoSalario = Double.parseDouble(salario2);
        double terceiroSalario = Double.parseDouble(salario3);
        double media = (primeiroSalario + segundoSalario + terceiroSalario)/3;

        System.out.println(media);
    }
}

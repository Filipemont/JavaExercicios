package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = new String();
        while(!(palavra.equalsIgnoreCase("sair"))){
            System.out.println("Digite sair para parar");
            palavra = sc.nextLine();
        }
        if(palavra.equalsIgnoreCase("sair")){
            System.out.println("Programa finalizado");
        }
        sc.close();
    }
}

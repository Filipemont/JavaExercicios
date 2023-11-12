package Controle;

import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double total =0;
        int notasValidas =0;
        double nota =0;

        while(nota != -1){
            System.out.print("Qual a nota desse aluno? ");
            nota = sc.nextDouble();
            if(nota <= 10 && nota>=0){
                total += nota;
                notasValidas ++;
            }else if(nota < -1 || nota > 10){
                System.out.println("Digite uma nota válida");
            }
        }
        double media = total/notasValidas;

        System.out.printf("A media dessa turma é: %.2f", media);
         sc.close();
    }
}

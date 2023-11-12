import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/2;
        if(media >=7){
            System.out.println("Aprovado");
        }else if(media < 4){
            System.out.println("Reprovado");
        }else{
            System.out.println("Final");
        }
    }
}

import java.util.Scanner;

public class Questao4 {
    static void imc(double peso, double altura){
        double result = peso/Math.pow(altura,2);
        System.out.printf("Seu imc é: %.2f", result);
    }

    static void pesoIdeal(double altura, String genero) {
        if (genero.toUpperCase().equals("HOMEM") || genero.toUpperCase().equals("H")) {
            double result = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal por ser homem é: %.2f", result);
        } else if (genero.toUpperCase().equals("MULHER") || genero.toUpperCase().equals("M")) {
            double result = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso por ser mulher é: %.2f", result);
        }else{
            System.out.println("Erro na leitura do genero para o calculo");
        }
    }

    public static void main(String[] args) {
        double altura;
        double peso;
        String genero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu genero?");
        genero = sc.nextLine();
        System.out.println("Qual a sua altura em metros?");
        altura = sc.nextDouble();
        System.out.println("Qual o seu peso em quilos?");
        peso = sc.nextDouble();
        System.out.println();

        imc(peso, altura);
        System.out.println();
        pesoIdeal(altura, genero);

    }
}

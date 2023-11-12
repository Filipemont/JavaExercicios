package Fundamentos.Operadores;

public class DesafioOperadoresAritimeticos {
    public static void main(String[] args) {
        int um = 1;
        int dois = 2;
        int tres = 3;
        int cinco = 5;
        int seis = 6;
        int sete = 7;
        int dez = 10;
        double primeiraExpressao;
        double segundaExpressao;
        double terceiraExpressao;
        double resultado;

        primeiraExpressao = Math.pow((seis*(tres + dois)),2)/(tres*dois);
        System.out.println(primeiraExpressao);
        segundaExpressao = Math.pow((((um - cinco) * (dois - sete))/2),2);
        System.out.println(segundaExpressao);
        terceiraExpressao = Math.pow((primeiraExpressao-segundaExpressao),3);
        System.out.println(terceiraExpressao);
        resultado = terceiraExpressao/Math.pow(10,3);
        System.out.println(resultado);
    }
}

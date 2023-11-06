package Operadores;

public class DesafioOperadoresLogicos {
    public static void main(String[] args) {
        boolean trabalho1 = false;
        boolean trabalho2 = true;

        if(trabalho1 == true && trabalho2 == true){
            System.out.println("Foi comprado a tv de 50 e todo mundo tomou sorvete");

        }else if(trabalho1 == true || trabalho2 == true){
            System.out.println("Foi comprado a tv de 32 e todo mundo tomou sorvete");
        }else{
            System.out.println("Vai todo mundo ficar com fome, porém, saudável!");
        }
    }
}

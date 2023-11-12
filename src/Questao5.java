public class Questao5 {
    static void PrimeiroMetodo(){
        System.out.println("Inicio da execucao do primeiro metodo!");
        SegundoMetodo();
        System.out.println("Fim da execucao do primeiro metodo");
    }
    static void SegundoMetodo(){
        System.out.println("Inicio da execução do segundo metodo!");
        double v[] = new double[5];
        try{
            for(int i =0; i<=10; i++){
                v[i] =i;
                System.out.println(i);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Fim da execução do segundo metodo");
        }
    }

    public static void main(String[] args) {
        System.out.println("Inicio da Main");
        PrimeiroMetodo();
        System.out.println("Fim da Main");
    }
}

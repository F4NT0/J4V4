public class Somatory{
    // Função Recursiva
    public int somatorio(int[] values,int initialPosition){
        if(initialPosition == values.length){
            return 0; 
        }
        int result = values[initialPosition] + somatorio(values,initialPosition+1);
        return result; 
    }

    public static void main(String[] args){
        Somatory somatorio = new Somatory();
        int[] values = {1,20,7,2};
        int soma = somatorio.somatorio(values, 0); // 3 posições
        System.out.println("Soma: " + soma);
    }
}
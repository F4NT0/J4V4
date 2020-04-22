public class Somatory{
    // Função Recursiva
    public void somatorio(int[] values,int initialPosition,int prevValue){
        if(initialPosition < values.length){
            int value = prevValue + values[initialPosition];
            System.out.println( prevValue + " + " + values[initialPosition] + " = " + value);
            somatorio(values,initialPosition+1, value);
        }
    }

    public static void main(String[] args){
        Somatory somatorio = new Somatory();
        int[] values = {1,20,7,2};
        somatorio.somatorio(values, 0, 0); // 3 posições
    }
}
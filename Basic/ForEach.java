/**
 * TESTE DE ESTRUTURA FOREACH
 */

public class ForEach{
    public static void main(String[] args){
        //Vetor de Teste
        int[] vetor = {1,2,3,4,5,6};
        

        System.out.println("NORMAL! \n");
        
        // For normal de Leitura
        for(int i = 0 ; i < vetor.length ; i++){
            System.out.println("Posição " + i + " : " + vetor[i]);
        }

        System.out.println("\n FOREACH! \n");
        
        // ForEach - Não tem como saber o Index, somente vai pegar todos os Dados
        for(int i : vetor){
            System.out.println("Valor : " + i);
        }
    }
}
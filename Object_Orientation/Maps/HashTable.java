import java.util.Map;
import java.util.Hashtable;
public class HashTable {
    public static void main(String args[]){

        //INICIANDO UM HASHTABLE
        Map<Integer,String> series = new Hashtable<>();

        //ADICIONANDO VALORES NO HASHTABLE
        series.put(1,"Supernatural");
        series.put(2,"Sense8");
        series.put(3,"Dr Who");
        series.put(4,"Westworld");
        series.put(5,"Spartacus");

        //Imprimindo o primeiro da tabela
        System.out.println("Valor da primeira chave: " + series.get(1));

        //Imprimindo todos os valores dentro do Hashtable
        for (int i = 0 ; i < series.size() ; i++){
            System.out.println(series.get(i));
        }

        //REMOVENDO UM VALOR
        series.remove(2);

        //Reimprimindo todos os valores sem o valor anterior
        for (int i = 0 ; i < series.size() ; i++){
            System.out.println(series.get(i));
        }
    }
}

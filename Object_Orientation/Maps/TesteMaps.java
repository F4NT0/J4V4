import java.util.HashMap;
import java.util.Map;

public class TesteMaps {
    public static void main(String[] args){
        //INICIANDO UM HASHMAP NOVO
        //Map<Chave,Informação> nomeMap = new HashMap<Chave,Informação>();
        Map<Integer,String> series = new HashMap<Integer,String>();

        //Adicionando valores no HashMap(aceita null)
        series.put(1,"Supernatural");
        series.put(2,"The Flash");
        series.put(3,"Spartacus");
        series.put(4,"Sense8");
        series.put(5,null);

        //Imprimindo um valor do HashMap
        System.out.println("Informação da chave 1: " + series.get(1));

        //Verificando se existe a chave no HashMap
        System.out.println("Existe chave 1? " + series.containsKey(1));

        //Verificando se existe a informação no HashMap
        System.out.println("Existe Supernatural? " + series.containsValue("Supernatural"));

        //Imprimindo o HashMap
        for(int i = 0 ; i < series.size() ; i++){
            System.out.println(series.get(i));
        }


    }
}

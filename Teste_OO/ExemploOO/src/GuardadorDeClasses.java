/**
 * Classe que armazena vários objetos criados pela classe Classe
 */
import java.util.ArrayList;
import java.util.Comparator;

public class GuardadorDeClasses {
    private ArrayList<Classe> classes;

    //Método construtor
    public GuardadorDeClasses(){
        classes = new ArrayList<Classe>();
    }

    //adicionando no Vetor:
    public void adicionar(Classe cl){
        classes.add(cl);
    }

    //listando todos os valores do Vetor:
    public ArrayList<Classe> listarTodas(){
        return classes;
    }

    //ordenando pelos numeros e valor:
    public void ordenar(){
        classes.sort(Comparator.comparing(Classe::getNumero).thenComparing(Classe::getValor));
    }
}

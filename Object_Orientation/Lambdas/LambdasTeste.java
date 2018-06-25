import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdasTeste {
    public static void main(String[] args){

        //Testando Lambda com uma Classe Objeto

        //Criando uma lista de pessoas usando a API List
        List<Pessoas> listaPessoas = Arrays.asList(new Pessoas("Gabriel",22),
                new Pessoas("Alexandre",30),
                new Pessoas("Douglas",21),
                new Pessoas("Larissa",40));

        //Ordenando a Lista de Pessoas pelo nome
        Collections.sort(listaPessoas,(Pessoas pessoa1,Pessoas pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()));
        //Imprimindo as informações usando lambda
        listaPessoas.forEach(p -> System.out.println(p.getNome()));





    }
}

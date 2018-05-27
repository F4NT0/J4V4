/**
 * • Define formalmente um conjunto de métodos que uma classe deverá implementar
 * numa classe interface ficam o tipo do método e seu nome e toda vez que
 * implementar essa classe interface,todos os metodos aqui embutidos devem ser
 * inicializados na outra classe, colocando a informação desejada dentro dos métodos
 * que façam sentido á aquela classe onde essa interface foi implementada
 *
 * Para implementar a classe interface em outras classes se faz desse jeito:
 *
 * public class nomeClasse implements nomeClasseInterface{...}
 *
 * o implements é o código que vai conectar as duas classes
 *
 * Pode se usar Multiplas classes de Interface, só dividir por virgulas na implementação:
 *
 * public class nomeClasse implements ClasseInterface1,ClasseInterface2,ClasseInterface3,...{...}
 */
public interface Imprimir { //esta classe interface serve para construir uma saida de texto
    void imprimir(); //dentro desse método em outras classes vai ser montado como deseja
    //a saida de texto.
}

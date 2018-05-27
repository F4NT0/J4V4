/**
 * Classe de teste das Classes
 *
 */
public class App {
    public static void main(String[] args){

      Classe novo = new Classe(123,"Gabriel",1500.0);
      Classe novo2 = new Classe(456,"Pedro",2000.0);
      GuardadorDeClasses gc = new GuardadorDeClasses();

      gc.adicionar(novo2);
        gc.adicionar(novo);

      gc.ordenar();

        System.out.println(gc.listarTodas());



    }
}

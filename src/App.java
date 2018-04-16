public class App {

    public static void main(String[] args){
        int valor1 = 3;
        int valor2 = 2;

        ifelseClasse novo = new ifelseClasse(valor1,valor2);


        //utilizando a classe ifelseClasse:


        //método do if-else comum
         System.out.println("Teste do if-else comum");
        //teste1:
        System.out.println(novo.testeIfElseComum(valor1,valor2));
        novo.imprimir();

        //teste2:
        novo.setValor1(5);
        novo.setValor2(5);
        System.out.println(novo.testeIfElseComum(valor1,valor2));
        novo.imprimir();


        //método do if-else sem as chaves
         System.out.println("Teste do if-else sem usar as chaves");
        //teste1:
        novo.setValor1(valor1);
        novo.setValor2(valor2);
        System.out.println(novo.testeIfElseSemChaves(valor1,valor2));
        novo.imprimir();

        //teste2:
        novo.setValor1(4);
        novo.setValor2(4);
        System.out.println(novo.testeIfElseSemChaves(valor1,valor2));
        novo.imprimir();

        //método do if-else usando a construção de condição
         System.out.println("Teste do if-else usando construçã de condição");
        //teste1:
        novo.setValor1(valor1);
        novo.setValor2(valor2);
        System.out.println(novo.testeIfElseCondicao(valor1,valor2));
        novo.imprimir();

        //teste2:
        novo.setValor1(6);
        novo.setValor2(6);
        System.out.println(novo.testeIfElseCondicao(valor1,valor2));
        novo.imprimir();



    }
}

public class App {

    public static void main(String[] args){
        int valor1 = 5;
        int valor2 = 5;

        ifelseClasse novo = new ifelseClasse(valor1,valor2);


        //utilizando a classe ifelseClasse:


        //método do if-else comum
         System.out.println("Teste do if-else comum");

        //teste1:

        novo.imprimir();
        System.out.println(novo.testeIfElseComum(novo.getValor1(),novo.getValor2()));

        //teste2:
        novo.setValor1(3);
        novo.setValor2(4);
        novo.imprimir();
        System.out.println(novo.testeIfElseComum(novo.getValor1(),novo.getValor2()));


        //método do if-else sem as chaves
        System.out.println("Teste do if-else sem usar as chaves");

        //teste1:
        novo.setValor1(valor1);
        novo.setValor2(valor2);
        novo.imprimir();
        System.out.println(novo.testeIfElseComum(novo.getValor1(),novo.getValor2()));

        //teste2:
        novo.setValor1(4);
        novo.setValor2(3);
        novo.imprimir();
        System.out.println(novo.testeIfElseComum(novo.getValor1(),novo.getValor2()));

        //método do if-else usando a construção de condição
         System.out.println("Teste do if-else usando construçã de condição");

         //teste1:
        novo.setValor1(valor1);
        novo.setValor2(valor2);
        novo.imprimir();
        System.out.println(novo.testeIfElseComum(novo.getValor1(),novo.getValor2()));

        //teste2:
        novo.setValor1(6);
        novo.setValor2(7);
        novo.imprimir();
        System.out.println(novo.testeIfElseComum(novo.getValor1(),novo.getValor2()));


        //Utilizando a classe do SwitchCaseClasse.java

        System.out.println("\nTeste da classe SwitchCase");
        switchCaseClasse testeSwitch = new switchCaseClasse(valor1,valor2);

        //teste1:
         testeSwitch.imprimir();
         testeSwitch.switchCase(testeSwitch.getValor1(),testeSwitch.getValor2());

        //teste2:
        testeSwitch.setValor1(10);
        testeSwitch.setValor2(30);
        testeSwitch.imprimir();
        testeSwitch.switchCase(testeSwitch.getValor1(),testeSwitch.getValor2());
    }
}

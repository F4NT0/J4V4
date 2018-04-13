public class App {

    public static void main(String[] args){
        int valor1 = 3;
        int valor2 = 2;
        int valor3 = 5;
        int valor4 = 5;

        ifelseClasse novo = new ifelseClasse(valor1,valor2);
        switchCaseClasse novo1 = new switchCaseClasse(valor3,valor4);



        //utilizando a classe ifelseClasse:


        //método do if-else comum
        novo.testeIfElseComum(valor1,valor2);
        System.out.println(novo.toString());

        //método do if-else sem as chaves
        novo.testeIfElseSemChaves(valor1,valor2);
        System.out.println(novo.toString());

        //método do if-else usando a construção de condição
        novo.testeIfElseCondicao(valor1,valor2);
        System.out.println(novo.toString());

        //utiliando a classe switchcaseClasse:

        //testando o método do switch-case
        novo1.switchCase(valor3,valor4);


    }
}

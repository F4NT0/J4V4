import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String args[]){
        //criando um ArrayList para armazenar as informações
        ArrayList<ClasseInfo> lista = new ArrayList<ClasseInfo>();

        //Adicionando informações para armazenar:
         Scanner entrada = new Scanner(System.in);
         System.out.println("Quantas entradas o arquivo terá: ");
          int numero = entrada.nextInt();
        for(int i = 0 ; i < numero; i++) {
            System.out.println("Informe o nome da Pessoa: ");
            String nome = entrada.next();
            System.out.println("Informe a idade da Pessoa: ");
            int idade = entrada.nextInt();
            ClasseInfo valor = new ClasseInfo(nome,idade);
            lista.add(valor);
        }

        //Adicionando agora as informações criadas em um arquivo
        Path path = Paths.get("Arquivo.txt");
        try(PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, Charset.forName("utf8")))){
            for(ClasseInfo info: lista){
                writer.format("%s;%s%n", info.getNome(),info.getIdade());
            }
        }catch (IOException e){
            System.err.format("Erro em criar a formatação: %s%n", e);
        }
    }
}

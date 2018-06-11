import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrevendoTexto2{
    public static void main(String args[]){
        Path caminhoArquivo = Paths.get("Dados.txt"); //Se não existir ele irá criar um
        try(PrintWriter escrever = new PrintWriter(Files.newBufferedWriter(caminhoArquivo, Charset.forName("utf8"))))
        {
           String nome = "leticia";
           String idade = "24";
           String telefone = "33558787";
           escrever.format("%s;%s;%s%n", nome,idade,telefone);
        }
        catch (IOException e){
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
}
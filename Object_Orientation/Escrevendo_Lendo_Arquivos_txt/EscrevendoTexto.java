import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrevendoTexto{
    public static void main(String args[]){
        Path caminhoArquivo = Paths.get("Arquivo.txt"); //Se não existir ele irá criar um
        try(PrintWriter escrever = new PrintWriter(Files.newBufferedWriter(caminhoArquivo, Charset.forName("utf8"))))
        {
            escrever.println("Escrevendo em uma linha");
            escrever.println("Escrevendo em outra linha");
        }
        catch (IOException e){
            System.err.format("Erro de E/S: %s%n", e);
        }
    }
}
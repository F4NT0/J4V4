import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LendoTexto {
    public static void main(String args[]){
        Path caminhoArquivo = Paths.get("Arquivo.txt"); //Procura pelo arquivo específico
        try(BufferedReader leitor = Files.newBufferedReader(caminhoArquivo, Charset.forName("utf8")))
        {
          String line = null; //a variável é iniciada nula, se não tiver informação no arquivo
            int count = 1;
          while((line = leitor.readLine()) != null)
          {
              System.out.println(count + " " + line);
              count++;
          }

        }
        catch (IOException e){
           System.err.format("Erro de E/S: %s%n", e);
        }
    }

}

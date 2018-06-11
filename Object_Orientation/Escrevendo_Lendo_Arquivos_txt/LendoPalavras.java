import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LendoPalavras {
    public static void main(String[] args) {
    	Path caminho = Paths.get("Arquivo.txt");
    	try (Scanner sc = new Scanner(Files.newBufferedReader(caminho,Charset.forName("utf8")))){
    		String palavra = null;
    		while(sc.hasNext()) {
    			palavra = sc.next();
    			System.out.println("Palavra: " + palavra);
    		}
    	}
    	catch (IOException x) {
    		System.err.format("Erro!" + x);
    	}
    }
}

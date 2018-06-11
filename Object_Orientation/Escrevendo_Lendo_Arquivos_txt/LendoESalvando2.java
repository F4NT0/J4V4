import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LendoESalvando2 {
   public static void main(String[] args) {
	   Path path2 = Paths.get("Dados.txt");
	   try (BufferedReader lendo = Files.newBufferedReader(path2, Charset.defaultCharset())){
		   String linha = null;
		   while((linha = lendo.readLine()) != null) {
			   Scanner sc = new Scanner(linha).useDelimiter(";"); //usando o limitador ;
		       String nome,idade,telefone;
		       nome = sc.next();
		       idade = sc.next();
		       telefone = sc.next();
		       System.out.format("%s %s %s%n", nome,idade,telefone);
		   }
	   }
	   catch (IOException x) {
		   System.err.format("Erro %s%n", x);
	   }
   }
} 

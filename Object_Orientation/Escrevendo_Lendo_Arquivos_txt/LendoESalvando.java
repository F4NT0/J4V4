import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LendoESalvando {
   public static void main(String[] args) {
	   Path path2 = Paths.get("Dados.txt");
	   try(Scanner sc = new Scanner(Files.newBufferedReader(path2,Charset.forName("utf8")))){
		   sc.useDelimiter("[;\n]"); //os Delimitadores do arquivo, que não serão lidos
		   //String header = sc.nextLine(); //pula o cabeçalho
		   String nome,idade,telefone;
		   while(sc.hasNext()) {
			   nome = sc.next();
			   idade = sc.next();
			   telefone = sc.next();
			   System.out.format("%s %s %s %n", nome,idade,telefone); //formato da saida 
		      //ou System.out.format("%s,%s = (%s) %n"), nome,idade,telefone);
		   }
	   }
	   catch (IOException x) {
		   System.err.format("Erro de E/S: %s%n", x);
	   }
   }
}

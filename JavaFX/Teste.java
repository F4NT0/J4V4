import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Classe de Estudos sobre JavaFX
 * JavaFx é uma forma de apresentar graficamente no programa
 * @author F4NT0
 * OBS: não esquecer de fazer o Resumo no GITHUB
 *
 */
public class Teste extends Application {
	//Um interface Gráfica em Java é baseada em Containers e Componentes
	//Stage é um container: corresponde a uma janela
	//Componentes no java: são formas usadas para apresentar uma informação
	
	@Override 
	 public void start(Stage primaryStage) {
		 StackPane root = new StackPane();
		 Scene cenaPrograma = new Scene(root,300,250); //criado um cena com um tamanho específico
		 	 
		 GridPane grid = new GridPane(); //Grid é a localização onde tudo vai ficar na tela
		 grid.setAlignment(Pos.CENTER); //o grid é o centro da tela
		 
		 grid.setHgap(10); //10 milimetros de espaço horizontal
		 grid.setVgap(10); // 10 milimetros de espaço vertical
		 
		 grid.setPadding(new Insets(25,25,25,25)); //definido o grid na tela
		 
		 Button botao1 = new Button(); //iniciado um novo botão
		 
		 botao1.setText("OPEN YOUR MIND!!"); //texto do botão
		
		 root.getChildren().add(botao1); //adicionar o botão
		  
		 primaryStage.setTitle("Página do F4NT0"); //título da página
		 
		 primaryStage.setScene(cenaPrograma);//define qual cena será feita
		 
		 primaryStage.show(); //Apresenta a cena
		 
	 }
	 
	public static void main(String[] args) {
		launch(args);
	}
   
}

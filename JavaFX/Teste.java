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
 * JavaFx � uma forma de apresentar graficamente no programa
 * @author F4NT0
 * OBS: n�o esquecer de fazer o Resumo no GITHUB
 *
 */
public class Teste extends Application {
	//Um interface Gr�fica em Java � baseada em Containers e Componentes
	//Stage � um container: corresponde a uma janela
	//Componentes no java: s�o formas usadas para apresentar uma informa��o
	
	@Override 
	 public void start(Stage primaryStage) {
		 StackPane root = new StackPane();
		 Scene cenaPrograma = new Scene(root,300,250); //criado um cena com um tamanho espec�fico
		 	 
		 GridPane grid = new GridPane(); //Grid � a localiza��o onde tudo vai ficar na tela
		 grid.setAlignment(Pos.CENTER); //o grid � o centro da tela
		 
		 grid.setHgap(10); //10 milimetros de espa�o horizontal
		 grid.setVgap(10); // 10 milimetros de espa�o vertical
		 
		 grid.setPadding(new Insets(25,25,25,25)); //definido o grid na tela
		 
		 Button botao1 = new Button(); //iniciado um novo bot�o
		 
		 botao1.setText("OPEN YOUR MIND!!"); //texto do bot�o
		
		 root.getChildren().add(botao1); //adicionar o bot�o
		  
		 primaryStage.setTitle("P�gina do F4NT0"); //t�tulo da p�gina
		 
		 primaryStage.setScene(cenaPrograma);//define qual cena ser� feita
		 
		 primaryStage.show(); //Apresenta a cena
		 
	 }
	 
	public static void main(String[] args) {
		launch(args);
	}
   
}

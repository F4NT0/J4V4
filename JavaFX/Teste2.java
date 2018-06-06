 
/** 
 * TODOS OS IMPORTS NECESSÁRIOS PARA COMPILAR O CÓDIGO 
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Criando em JavaFX uma tela de login
 * @author F4NT0
 * Tutorial do link: https://docs.oracle.com/javase/8/javafx/get-started-tutorial/form.htm
 */

public class Teste2 extends Application{ //se faz a extenção de applications para rodar o programa
   //Criando o Stage para escrever o código
	
/**
 * Método da Tela inicial de Login
 * @param stageInicial
 */
    public void start(Stage stageInicial) { //Passo 1: Criar um Stage para trabalhar nele
	   stageInicial.setTitle("Minha tela de Login"); //Título da Página(Passo 1)
	
	   //Passo 2: Criar um Grid (área onde vai ficar as coisas)
	   GridPane grid = new GridPane(); //Iniciado o Grid
	   grid.setAlignment(Pos.CENTER); //o grid fica agora centralizado na tela
	   grid.setHgap(10); //o espaçamento horizontal é 10 milimetros
	   grid.setVgap(10); //o espacamento vertical é 10 milimetros
	   grid.setPadding(new Insets(25,25,25,25)); //serve para 
	
	   //Passo 3: Criando um texto na Tela
	   Text tituloDaTela = new Text("Bem vindo ao Mundo do Fanto"); //Mensagem que aparecerá no código
	    tituloDaTela.setFont(Font.font("Courier New",  FontWeight.EXTRA_BOLD,20)); //definindo a fonte(nomefonte,formadafonte,tamanhodafonte)
	    grid.add(tituloDaTela,0,0,2,1);
	
	    //Passo 4: Criando um Rótulo para colocar o nome
	    Label userName = new Label("Seu nome: "); //titulo do rótulo
	    grid.add(userName,0,1); //localização dele no grid
	    
	    //Passo 5: Criando uma área para escrever o seu nome
	    TextField areaDeTexto1 = new TextField(); //nova área de texto
	    grid.add(areaDeTexto1,1,1); //localização dele no grid
	    
	    //Passo 4: Criando um rótulo para colocar a Senha
	    Label password = new Label("Sua senha: "); //título do Rótulo
	    grid.add(password, 0, 2); //localização dele no grid
	    
	    //Passo 5: Criando uma área para escrever a senha
	    PasswordField areaDaSenha = new PasswordField();
	    grid.add(areaDaSenha, 1, 2);
	    
	    //Passo 6: Adicionando um botão para finalizar
	    Button botao = new Button("Entre por sua conta e Risco!"); //criado um botão com texto
	    HBox caixaBotao = new HBox(); //criado uma caixa para o botão
	    caixaBotao.setAlignment(Pos.BOTTOM_CENTER); //centralizado o botão na tela
	    caixaBotao.getChildren().add(botao); //adicionado o botão na caixa
	    grid.add(caixaBotao, 1, 4); //adicionado o botão no Grid
	    
	    //Passo 7: Adicionando o controlador para exibir texto na tela
	    final Text textoDeAcao = new Text(); //código para poder apresentar um texto na tela
	    grid.add(textoDeAcao, 1, 6);
	    
	    //Passo 8: LIDANDO COM O EVENTO DE CLICAR
	    botao.setOnAction(new EventHandler<ActionEvent>() {
	    //quando alguem clicar na tela, irá apresentar um texto em vermelho
	         @Override
	        public void handle(ActionEvent e) { 
	    	  textoDeAcao.setFill(Color.FIREBRICK);
	    	  textoDeAcao.setText("SE FERROU!!!!");
	    }
	    });
	
       	//Passo 2: criar uma nova cena com o grid
	     Scene scene = new Scene(grid,500,300); //criado uma cena
	     stageInicial.setScene(scene); //definido a cena criada no prjeto
	     stageInicial.show(); //apresentação da página(Passo 1)
     }	
    
    public static void main(String[] args) {
    	//graças a extensão de applications, podemos rodar o programa
    	   launch(args);
    }
    
}


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
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/**
 * Criando em JavaFX uma tela de login
 * @author F4NT0
 * Tutorial do link: https://docs.oracle.com/javase/8/javafx/get-started-tutorial/form.htm
 */

public class FantoMatrix extends Application{

       //MÉTODOS PARA LIDAR COM OS EVENTOS:
    /**
     * Método para verificar o evento da senha:
     */
    public boolean verSenha(PasswordField areaDaSenha,Text textoDeAcao){
        if(areaDaSenha.getText().equals("fanto123")){  //SENHA PERMITIDA PELO SISTEMA
            textoDeAcao.setText("PERMIÇÃO CONCEDIDA!"); //MENSAGEM QUE SERÁ APRESENTADO
            textoDeAcao.setFill(Color.LIGHTGREEN);
            textoDeAcao.setFont(Font.font("Courier New", FontWeight.NORMAL,18));
            return true;
        }
        else{
            textoDeAcao.setText("ACESSO NEGADO!"); //MENSAGEM QUE SERA APRESENTADO
            textoDeAcao.setFill(Color.FIREBRICK);
            textoDeAcao.setFont(Font.font("Courier New", FontWeight.NORMAL,18));
             return false;
        }
    }

    /**
     * Método para chamar a segunda Tela
     */
    public void chamadaTela(){
        SegundaTela novo = new SegundaTela();
        Stage tela2 = new Stage();
        try {
            novo.start(tela2);
        }
        catch (FileNotFoundException x){
            System.err.println("Erro de Chamada" + x);
        }
    }

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
            tituloDaTela.setFont(Font.font("Courier New",  FontWeight.BOLD,20)); //definindo a fonte(nomefonte,formadafonte,tamanhodafonte)
            grid.add(tituloDaTela,0,0,2,1);
            tituloDaTela.setFill(Color.FORESTGREEN);

            //Passo 4: Criando um Rótulo para colocar o nome
            Label userName = new Label("Seu nome: "); //titulo do rótulo
            grid.add(userName,0,1); //localização dele no grid
            userName.setFont(Font.font("Courier New",  FontWeight.NORMAL,15));
            userName.setTextFill(Color.GREEN); //colocar a cor do texto em vermelho

            //Passo 5: Criando uma área para escrever o seu nome
            TextField areaDeTexto1 = new TextField(); //nova área de texto

            areaDeTexto1.getStyleClass().add("areaDeTexto"); //definindo o estilo da área de texto do arquivo CSS


            grid.add(areaDeTexto1,1,1); //localização dele no grid


            //Passo 4: Criando um rótulo para colocar a Senha
            Label password = new Label("Sua senha: "); //título do Rótulo
            grid.add(password, 0, 2); //localização dele no grid
            password.setTextFill(Color.GREEN); //colocar a cor do texto em verde
            password.setFont(Font.font("Courier New",  FontWeight.NORMAL,15));

            //Passo 5: Criando uma área para escrever a senha
            PasswordField areaDaSenha = new PasswordField();

            areaDaSenha.getStyleClass().add("PasswordField"); //definindo o estilo da área de senha do arquivo CSS

            grid.add(areaDaSenha, 1, 2); //adicionando a area da senha no grid definido

            //Passo 6: Adicionando um botão para finalizar
            Button botao = new Button("Entre por sua conta e Risco!"); //criado um botão com texto
            HBox caixaBotao = new HBox(); //criado uma caixa para o botão
            caixaBotao.setAlignment(Pos.BOTTOM_CENTER); //centralizado o botão na tela
            caixaBotao.getChildren().add(botao); //adicionado o botão na caixa

            botao.getStyleClass().add("botao"); //adicionado a estilização do botão criado no CSS

            grid.add(caixaBotao, 1, 4); //adicionado o botão no Grid

            //Passo 7: Adicionando o controlador para exibir texto na tela
            final Text textoDeAcao = new Text(); //código para poder apresentar um texto na tela
            grid.add(textoDeAcao, 1, 6);

            //Passo 8: LIDANDO COM O EVENTO DE CLICAR BOTÃO(No formato de Lambda)
            botao.setOnAction(e -> {
                verSenha(areaDaSenha, textoDeAcao);
                if(verSenha(areaDaSenha,textoDeAcao)){
                    chamadaTela();
                }

            });


            //Passo 2: criar uma nova cena com o grid
            Scene scene = new Scene(grid,500,300); //criado uma cena
            stageInicial.setScene(scene); //definido a cena criada no prjeto

            //Passo 9: LIDANDO COM O TECLADO
            scene.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if(event.getCode() == KeyCode.ENTER){
                        botao.fire();
                    }
                }
            });

            //Abaixo segue o código para pegar as informações em CSS do arquivo CssLogin na mesma pasta
            scene.getStylesheets().add(FantoMatrix.class.getResource("CssLogin.css").toExternalForm());

            stageInicial.show(); //apresentação da página(Passo 1)
        }

    /**
     * Método Main do Programa
     * @param args
     */
    public static void main(String[] args) {
            //graças a extensão de applications, podemos rodar o programa
            launch(args);
        }

    }

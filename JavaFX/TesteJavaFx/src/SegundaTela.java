import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Text;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import static javafx.application.Application.launch;

public class SegundaTela extends Application{


    /**
     * Método para fazer um cálculo
     * @param i
     * @param j
     * @return
     */
    public String calculo(String i, String j,String op){
        int valor1 = Integer.parseInt(i);
        int valor2 = Integer.parseInt(j);
        int result = 0;
        String saida;

        switch(op){
            case "+" :
                   result = valor1+valor2;
                   saida = Integer.toString(result);
                   return saida;


            case "-" :
                result = valor1-valor2;
                saida = Integer.toString(result);
                return saida;

            case "/" :
                if(valor1 > valor2){
                    result = valor2/valor1;
                    saida = Integer.toString(result);
                    return saida;
                }
                else{
                    result = valor1/valor2;
                    saida = Integer.toString(result);
                    return saida;
                }

            case "*" :
                result = valor1*valor2;
                saida = Integer.toString(result);
                return saida;

            case "%" :
                if(valor1 > valor2){
                    result = valor2 % valor1;
                   saida = Integer.toString(result);
                   return saida;
                }
                else{
                    result = valor1 % valor2;
                    saida = Integer.toString(result);
                    return saida;
                }

            default:
                saida = "ERROR!!";
                return saida;
        }

    }






    /**
     * Segunda Tela do Projeto
     */
    public void start(Stage segundaTela) throws FileNotFoundException{
        segundaTela.setTitle("MATRIX");

        //CRIANDO UM GRID TOTAL
        GridPane gridTotal = new GridPane();
        //gridTotal.setHgap(10);
        //gridTotal.setVgap(6);
        gridTotal.setAlignment(Pos.CENTER);
        gridTotal.setPadding(new Insets(100,100,100,100));
        //gridTotal.setGridLinesVisible(true);


        //ADICIONANDO UM LOCAL DE LEITURA A ESQUERDA
        TextArea editor1 = new TextArea();
        editor1.setPrefSize(100,200);
        editor1.setWrapText(true);
        editor1.setPromptText("SAIDA DO CÁLCULO AQUI");

        gridTotal.add(editor1,0,0);

        editor1.getStyleClass().add("TextArea");



        /**
         * ÁREAS DOS TEXTOS ONDE SERÃO USADOS PARA A CALCULADORA
         */
        //ADICIONANDO O LOCAL DE ENTRADA DE OPERAÇÃO
       TextField editor2 = new TextField();
       editor2.setPromptText("OPERADOR");
       GridPane.setHalignment(editor2,HPos.CENTER);
       //gridTotal.add(editor2,2,0);
       editor2.getStyleClass().add("TextArea");

       //ADICIONANDO O LOCAL DE ENTRADA DO PRIMEIRO NUMERO
        TextField editor3 = new TextField();
        editor3.setPromptText("PRIMEIRO VALOR");
        editor3.getStyleClass().add("TextArea");

        //ADICIONANDO O LOCAL DE ENTRADA DO SEGUNDO NUMERO
        TextField editor4 = new TextField();
        editor4.setPromptText("SEGUNDO VALOR");
        editor4.getStyleClass().add("TextArea");


        /**
         * CRIANDO UM HBOX PARA COLOCAR TODOS OS TEXTFIELDS
         */
        VBox teste = new VBox(8);
        teste.setAlignment(Pos.CENTER);
        teste.getChildren().addAll(editor2,editor3,editor4);
        gridTotal.add(teste,3,0);



       //ADICIONANDO O LOCAL DE ENTRADA DO PRIMEIRO VALOR


        /**
         * CRIANDO BOTÃO PARA CALCULAR
         */

        Button botao = new Button("CALCULAR"); //criado um botão com texto
        Button botao2 = new Button("ENCERRAR");
        VBox caixaBotao = new VBox(); //criado uma caixa para os botões
        //caixaBotao.setAlignment(Pos.BOTTOM_CENTER); //centralizado o botão na tela
        caixaBotao.getChildren().add(botao); //adicionado o botão na caixa
        caixaBotao.getChildren().add(botao2);

        botao.getStyleClass().add("botaoCalcular"); //adicionado a estilização do botão criado no CSS
        botao2.getStyleClass().add("botaoEncerrar");

        gridTotal.add(caixaBotao, 2, 2); //adicionado o botão no Grid

        //LIDANDO COM EVENTOS DO BOTÃO
        botao.setOnAction(e -> {
            editor1.setText(calculo(editor3.getText(),editor4.getText(),editor2.getText()));

        });

        botao2.setOnAction(e ->{
            segundaTela.close();
        });

        /**
         * ADICIONANDO O TEXTO GUIA PARA FAZER CÁLCULOS
         */
         Label info1 = new Label("MANUAL: ");
         Label info3 = new Label("SELECIONE O OPERADOR DESEJADO");
         Label info4 = new Label("BOTÃO PAGE-UP: PRIMEIRO VALOR");
         Label info5 = new Label("BOTÃO PAGE-DOWN: SEGUNDO VALOR");
         Label info6 = new Label("ESC: ENCERRAR PROGRAMA");
        info1.getStyleClass().add("Label");
        info3.getStyleClass().add("Label");
        info4.getStyleClass().add("Label");
        info5.getStyleClass().add("Label");
        info6.getStyleClass().add("Label");


        //MENSAGEM COM OS OPERADORES
        Label op1 = new Label("ADD ( + )");
        Label op2 = new Label("SUB ( - )");
        Label op3 = new Label("MUL ( * )");
        Label op4 = new Label("DIV ( / )");
        Label op5 = new Label("REST( % )");

        op1.getStyleClass().add("Label2");
        op2.getStyleClass().add("Label2");
        op3.getStyleClass().add("Label2");
        op4.getStyleClass().add("Label2");
        op5.getStyleClass().add("Label2");


        VBox operadores = new VBox(2);
        operadores.setFillWidth(true);
        operadores.getChildren().addAll(op1,op2,op3,op4,op5);
        gridTotal.add(operadores,2,1);


        //MENSAGEM DE MANUAL NA TELA
        VBox mensagem = new VBox(2);
        mensagem.getChildren().add(info1);
        mensagem.getChildren().add(info3);
        mensagem.getChildren().add(info4);
        mensagem.getChildren().add(info5);
        mensagem.getChildren().add(info6);
        gridTotal.add(mensagem,3,1);


        /**
         * ADICIONANDO UM GIF NO PROJETO
         */

        //Testando se o Gif existe

        Image imagem = new Image(new FileInputStream("C:\\Users\\16105016\\Desktop\\Java_Basics\\JavaFX\\TesteJavaFx\\src\\matrixCube.gif"));

       //adicionando o gif no sistema
        ImageView imageView = new ImageView(imagem);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);
        GridPane.setHalignment(imageView, HPos.RIGHT);
        GridPane.setValignment(imageView, VPos.TOP);

       //adicionando o gif no projeto
        gridTotal.add(imageView,0,1);



        /**
         * Inicialização do Stage no sistema
         */

        Scene scene = new Scene(gridTotal,800,500);
        segundaTela.setScene(scene);
        scene.getStylesheets().add(SegundaTela.class.getResource("CssLogin.css").toExternalForm());


        /**
         * Configurando botões do teclado na tela
         */
        scene.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.MINUS){ //SIMBOLO DE MENOS DO TECLADO DO LADO
                    editor2.requestFocus();

                }
                if(event.getCode() == KeyCode.SLASH){ //SIMBOLO "/" DO TECLADO
                    editor2.requestFocus();

                }
                if((event.getCode() == KeyCode.DIGIT8) && event.isShiftDown()){ //SIMBOLO "*" DO TECLADO
                    editor2.requestFocus();

                }
                if(event.getCode() == KeyCode.ADD){ //SIMBOLO "+" DO TECLADO DO LADO
                    editor2.requestFocus();

                }
                if(event.getCode() == KeyCode.MULTIPLY){ // SIMBOLO "*" DO TECLADO DO LADO
                    editor2.requestFocus();

                }
                if(event.getCode() == KeyCode.DIVIDE){ //SIMBOLO "/" DO TECLADO DO LADO
                    editor2.requestFocus();

                }
                if(event.getCode() == KeyCode.SUBTRACT){ //SIMBOLO "-" DO TECLADO DO LADO
                    editor2.requestFocus();

                }
                if((event.getCode() == KeyCode.DIGIT5) && event.isShiftDown()){ //SIMBOLO "%" DO TECLADO DO LADO
                    editor2.requestFocus();

                }

                if(event.getCode() == KeyCode.PAGE_UP){ //TECLA PAGE UP SERVE PARA ESCREVER O PRIMEIRO NUMERO
                    editor3.requestFocus();

                }
                if(event.getCode() == KeyCode.PAGE_DOWN){//TECLA PAGE DOWN SERVE PARA ESCREVER O SEGUNDO NUMERO
                    editor4.requestFocus();
                }
                if(event.getCode() == KeyCode.ENTER){ //TECLA ENTER CALCULA OS NUMEROS
                    botao.fire();
                }
                if(event.getCode() == KeyCode.ESCAPE){//TECLA ESC FECHA O PROGRAMA
                    segundaTela.close();

                }
            }
        });

        segundaTela.show();
    }

   // public static void main(String[] args){
       // launch(args);
   // }

}

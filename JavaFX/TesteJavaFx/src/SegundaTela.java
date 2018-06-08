import javafx.application.Application;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.jnlp.IntegrationService;
import javax.xml.soap.Text;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

import static javafx.application.Application.launch;

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
        gridTotal.setGridLinesVisible(true);


        //ADICIONANDO UM LOCAL DE LEITURA A ESQUERDA
        TextArea editor1 = new TextArea();
        editor1.setPrefSize(100,200);
        editor1.setWrapText(true);

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
        HBox caixaBotao = new HBox(); //criado uma caixa para o botão
        //caixaBotao.setAlignment(Pos.BOTTOM_CENTER); //centralizado o botão na tela
        caixaBotao.getChildren().add(botao); //adicionado o botão na caixa

        botao.getStyleClass().add("botao"); //adicionado a estilização do botão criado no CSS

        gridTotal.add(caixaBotao, 2, 2); //adicionado o botão no Grid

        //LIDANDO COM EVENTOS DO BOTÃO
        botao.setOnAction(e -> {
            editor1.setText(calculo(editor3.getText(),editor4.getText(),editor2.getText()));

        });




        /**
         * ADICIONANDO UM GIF NO PROJETO
         */

        //Testando se o Gif existe

        Image imagem = new Image(new FileInputStream("/home/16105016/Área de Trabalho/TesteJavaFx/src/matrixCube.gif"));

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

        segundaTela.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

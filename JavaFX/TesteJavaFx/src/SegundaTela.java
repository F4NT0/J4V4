import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class SegundaTela extends Application{
    /**
     * Segunda Tela do Projeto
     */
    public void start(Stage segundaTela){
        segundaTela.setTitle("MATRIX");

        //CRIANDO UM GRID TOTAL
        GridPane gridTotal = new GridPane();
        gridTotal.setHgap(4);
        gridTotal.setVgap(2);
        gridTotal.setPadding(new Insets(25,25,25,25));


        //ADICIONANDO UM LOCAL DE LEITURA A ESQUERDA
        TextArea editor1 = new TextArea();
        editor1.setPrefSize(200,800);
        GridPane.setHalignment(editor1, HPos.LEFT);
        gridTotal.add(editor1,0,0);

        //ADICIONANDO UM LOCAL DE LEITURA A DIREITA EM CIMA
        TextArea editor2 = new TextArea();
        editor2.setPrefSize(300,100);
        GridPane.setHalignment(editor2, HPos.RIGHT);
        GridPane.setValignment(editor2, VPos.BOTTOM);
        gridTotal.add(editor2,3,2);

        //ADICIONANDO UM LOCAL DE LEITURA



        Scene scene = new Scene(gridTotal,1000,800);
        segundaTela.setScene(scene);
        scene.getStylesheets().add(SegundaTela.class.getResource("CssLogin.css").toExternalForm());

        segundaTela.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}

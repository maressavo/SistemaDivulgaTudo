package visao;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class TelaPrincipal {

    @FXML
    private Pane telacad;

    @FXML
    private Button Buttonrelatorio;

    @FXML
    void Cadastraranuncio(MouseEvent event) {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("Sistema.fxml"));
        Pane root;
		try {
			root = (Pane) loader.load();
			telacad.getChildren().add(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           }

    @FXML
    void Gerarelatorio(MouseEvent event) {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("relatorio.fxml"));
        Pane root;
		try {
			root = (Pane) loader.load();
			telacad.getChildren().add(root);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}

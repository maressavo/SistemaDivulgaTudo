package visao;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import modelo.Modeloanuncio;

public class TelaCad implements Initializable{

    @FXML
    private Pane telacad;

    @FXML
    private TextField nomeanuncio;

    @FXML
    private TextField nomecliente;

    @FXML
    private DatePicker datainicio;

    @FXML
    private DatePicker datafinal;

    @FXML
    private TextField investimentodia;
    
    private boolean Valida=true;
    String erro="";
    Modeloanuncio modelo = new Modeloanuncio();
    @FXML
    void Registrar(MouseEvent event) {
    	
    	if(nomeanuncio.getText()!=null) {
    		if(!modelo.Validarnome(nomeanuncio.getText())) {
    			erro=erro+"\n Preencha o nome do anúncio com no mínimo 4 caracteres";
    			Valida=false;
    		}
    	}
    	else {
    		erro=erro+"\n Preencha o nome do anúncio com no mínimo 4 caracteres";
    		Valida=false;
    	}
    	if(nomecliente.getText()!=null) {
    		if(!modelo.Validarnome(nomecliente.getText())) {
        		erro=erro+"\n Preencha o nome do cliente com no mínimo 4 caracteres";
    			Valida=false;
    		}
    	}
    	else {
    		erro=erro+"\n Preencha o nome do cliente com no mínimo 4 caracteres";
    		Valida=false;
    	}
    	
    	if(datainicio.getValue()==null) {
    		erro=erro+"\n Selecione uma data para início!";
    		Valida=false;}
    	else {
    	if(datafinal.getValue()!=null) {
    		if(!modelo.Validarfinal(Date.valueOf(datainicio.getValue()),Date.valueOf(datafinal.getValue()))) {
    			erro=erro+"\n A data final não pode ser menor ou igual à data inicial.";
    	    	
    			Valida=false;
    		}
    	}}
    	if(datafinal.getValue()==null) {
    		erro=erro+"\n Selecione uma data para o final do anúncio.";
    		Valida=false;
    	}
    	
    	if(investimentodia.getText()!=null) {
    		try{
    			   
    		Double.parseDouble(investimentodia.getText().replace(",", ".")); 
    		} 
    		  catch(NumberFormatException e ){
    				erro=erro+"\n Por favor informe um valor válido para investimento.";
    				Valida=false;
    		    		  } 
    	}
    	else {
    		erro=erro+"\n Informe um valor para investimento por dia.";
    		Valida=false;
    	}
    	
    	if(Valida) {
    		if(modelo.Salvar(nomeanuncio.getText(), nomecliente.getText(), Date.valueOf(datainicio.getValue()),Date.valueOf(datafinal.getValue()), Double.parseDouble(investimentodia.getText().replace(",", ".")))) {
    			Alert dialogoInfo = new Alert(Alert.AlertType.CONFIRMATION);
                dialogoInfo.setTitle("SUCESSO!");
                //dialogoInfo.setHeaderText("Erro..."+erro);
                dialogoInfo.setContentText("Cadastro realizado com sucesso.");
                dialogoInfo.showAndWait();
    		}
    		else {
    			Alert dialogoInfo = new Alert(Alert.AlertType.CONFIRMATION);
                dialogoInfo.setTitle("Falha na inserção!");
                //dialogoInfo.setHeaderText("Erro..."+erro);
                dialogoInfo.setContentText("Não foi possível inserir os dados informados. Tente novamente.");
                dialogoInfo.showAndWait();
    		}
    	}
    	else {
    		Alert dialogoInfo = new Alert(Alert.AlertType.ERROR);
            dialogoInfo.setTitle("Mensagem de erro");
            //dialogoInfo.setHeaderText("Erro..."+erro);
            dialogoInfo.setContentText(erro);
            dialogoInfo.showAndWait();
    	}
    	Valida=true;
    	erro="";//para limpar mensagens de erro anteriores.
    	nomeanuncio.setText(null);
		nomecliente.setText(null);
		datainicio.setValue(null);
		datafinal.setValue(null);
		investimentodia.setText(null);
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		nomeanuncio.setText(null);
		nomecliente.setText(null);
		datainicio.setValue(null);
		datafinal.setValue(null);
		investimentodia.setText(null);
	}

}

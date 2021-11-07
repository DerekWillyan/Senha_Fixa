package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private TextField senha;
	@FXML
	private Button entrar;
	@FXML
	private Label resul;
	
	@FXML
	public void onbtnEntrar() {
		
		int senha = Integer.parseInt(this.senha.getText());
		
		if(senha == 2002) {

			this.resul.setText(String.format("Acesso Permitido"));
			
		}else {
			
			this.resul.setText("Acesso Negado");
			
		}
		
	}
	
}

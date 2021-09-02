package ex02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
	@FXML
	private Button btn;// 우리가 정해줬던 이름과 똑같이 써야함
	@FXML private TextField txtField;
	@FXML private TextField txtField2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("초기화 목적으로 사용합니다.");
		btn.setOnAction(e -> {
			txtPrint();
		});
	}

	public void txtPrint() {
		txtField2.setText(txtField.getText());
		txtField.setText("");
		
	}

}

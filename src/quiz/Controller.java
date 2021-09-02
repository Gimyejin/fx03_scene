package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable {
	@FXML
	private Button btn;
	@FXML
	private TextField id;
	@FXML
	private TextField pw;
	MyDB db;
	Alert alert;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// 초기화 목적으로 사용됨
		btn.setOnAction(e -> {
			check();

		});
	}

	public void check() {
		alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("메세지");
		alert.setHeaderText("메시지");
		
		if (id.getText().isEmpty()) {
			alert.setContentText("id를 입력해야합니다.");
			alert.show();
		} else if (pw.getText().isEmpty()) {
			alert.setContentText("pw를 입력해야합니다.");
			alert.show();
		} else {
			login();
		}

	}

	public void login() {
		db = new MyDB();
		if (db.getTable().containsKey(id.getText())&&db.getTable().containsValue(pw.getText())) {
				alert.setContentText("로그인 성공");
				alert.show();
		}else {
			alert.setContentText("로그인 실패");
			alert.show();
		}
	}
}

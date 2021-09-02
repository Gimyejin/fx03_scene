package ex02;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		System.out.println(1111);
		
		Parent root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		//load(getClass().getResource("eventTest.fxml"))이거 하는 순간 바로 작동됨
		//로드를 하면 eventTest.fxml가 실행된다(객체생성된다)
		//eventTest.fxml에 ex02.Controller랑 연결했는데 이것도 같이 객채화가 된다.
		
		System.out.println(2222);
		Scene scene=new Scene(root);
		System.out.println(3333);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}

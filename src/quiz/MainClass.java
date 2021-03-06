package quiz;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root =FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		Scene sc=new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

package App;

import java.util.ArrayList;
import java.util.Random;

import Controllers.MainScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/mainScreen.fxml"));
		Pane mPane = loader.load();
		primaryStage.setTitle("Eulerian graph");
		primaryStage.setResizable(true);
		primaryStage.setScene(new Scene(mPane));
		primaryStage.show();
		
		MainScreenController msc = loader.getController();
		
	}
	

}

package Controllers;

import java.util.ArrayList;

import App.Marker;
import App.MarkerDrawer;
import App.MarkerLineDrawer;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class MainScreenController {
	
	@FXML
	Pane mPane;
	
	@FXML
	void initialize() {
		
	}
	
	@FXML
	void DrawMarkers(MouseEvent event) {
		mPane.getChildren().clear();
		MarkerDrawer drawer = new MarkerDrawer();
		drawer.drawMarkers(mPane);
		
		MarkerLineDrawer mld = new MarkerLineDrawer();
		mld.setListOfMarkers(drawer.getListOfMarkers());
		mld.setmPane(mPane);
		mld.ConnectAllMarkers();
	}
	
}

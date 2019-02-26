package App;

import java.util.ArrayList;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class MarkerLineDrawer {
	
	Pane mPane;
	
	private ArrayList<Circle> listOfMarkers;

	public void ConnectAllMarkers() {
		Line mLine = new Line(0,0,0,0);
		for(int i = 0 ; i < listOfMarkers.size(); i++) {
			for(int c = 1; c < listOfMarkers.size(); c++) {
				mLine = new Line(listOfMarkers.get(i).getCenterX(), listOfMarkers.get(i).getCenterY(), 
						listOfMarkers.get(c).getCenterX(), listOfMarkers.get(c).getCenterY());
				mPane.getChildren().add(mLine);
			}
		}
	}
		
		public void setListOfMarkers(ArrayList<Circle> listOfMarkers) {
		this.listOfMarkers = listOfMarkers;
	}

	public void setmPane(Pane mPane) {
		this.mPane = mPane;
	}

}

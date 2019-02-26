package App;

import java.util.ArrayList;
import java.util.Random;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MarkerDrawer {

	private ArrayList<Circle> listOfMarkers = new ArrayList<>();
	
	public void drawMarkers(Pane mPane) {
		listOfMarkers.clear();
		while(true) {
			Circle circle = new Circle(setCoor(true), setCoor(false), 5f, Color.DARKORANGE);
			mPane.getChildren().add(circle);
			
			listOfMarkers.add(circle);
			
			if(listOfMarkers.size()> 3) {
				break;
			}
		}
	}
	
	private double setCoor(boolean result) {
		Random r = new Random();
		boolean result2 = false;
		double coor = r.nextInt(600);
		while(true && listOfMarkers.size() > 0) {
			coor = r.nextInt(600);
			for(Circle c : listOfMarkers) {
				System.out.println(Math.abs((c.getCenterX()-coor)) + " >= 20");
				if(Math.abs((c.getCenterX()-coor))>=20 && result 
						|| Math.abs((c.getCenterY()-coor))>=20 && !result) {
					result2 = true;
				}else {
					result2 = false;
					break;
				}
			}
			
			if(result2) {
				break;
			}
			
		}
		
		return coor;
	}

	public ArrayList<Circle> getListOfMarkers() {
		return listOfMarkers;
	}
	
}

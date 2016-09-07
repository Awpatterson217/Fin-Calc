/*
 *  The Main class contains the main method.
 */

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.*; 
import javafx.scene.layout.*;

public class MainInterface extends Application { 
	
	public static void main(String args[]){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// This is the title.
		primaryStage.setTitle("The Financial Calculator");
		
		// This creates an instance of the primary layout used for this application.
		GridPane primaryLayout = new GridPane();
		
		// This creates an instance of the primary scene used for this application. 
		Scene primaryScene = new Scene(primaryLayout, 600, 600);
		
		//The primaryStage will contain the primaryScene.
		primaryStage.setScene(primaryScene);
		
		//This will show the primaryStage.
		primaryStage.show();
	}
}

package hamburgers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {

		Pane pane = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("Hamburgers");
		stage.getIcons().add(new Image("img/hamburger.png"));
		stage.initStyle(StageStyle.UNIFIED);
		stage.centerOnScreen();
		stage.show();
	}
}
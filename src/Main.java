import javafx.application.Application;
import javafx.stage.Stage;

//головний клас програми

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Metod.Okno("Start.fxml");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
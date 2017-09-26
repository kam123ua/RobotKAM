import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//клас в якому описуються загальні методи програми

public class Metod {
	
	//функція виводу помилки при не заповненості полів
	
	public static void Empy(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(Const.ErrorMessage);
		alert.setHeaderText(null);
		alert.setContentText("Заповніть всі поля!");
		alert.showAndWait();
	}
	
	//повідолення про помилку вводу
	
	public static void Alert_of_input_error(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(Const.ErrorMessage);
		alert.setHeaderText(null);
		alert.setContentText("У полі вводу кнопки миші введіть \'L\' або \'R\' !");
		alert.showAndWait();
	}
	
	//функція відкриття нового вікна з форми (str)
	
	public static void Okno(String str){	
		Stage primaryStage = new Stage();
    		Pane mainPane;
		try {
			mainPane = (Pane)FXMLLoader.load(Start.class.getResource(str));
			primaryStage.setScene(new Scene(mainPane));
			primaryStage.setResizable(false);
			primaryStage.setTitle(Const.Name);
			primaryStage.getIcons().add(new Image(Const.Icon));
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}	
	
}

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Menu {

    @FXML
    private Button btnKey;

    @FXML
    void Key(ActionEvent event) {
    	Stage stage = (Stage) btnKey.getScene().getWindow();
        stage.close();
        Metod.Okno("KeyFrame.fxml");
    }

    @FXML
    void Mouse(ActionEvent event) {
    	Stage stage = (Stage) btnKey.getScene().getWindow();
        stage.close();
        Metod.Okno("MouseFrame.fxml");
    }

}
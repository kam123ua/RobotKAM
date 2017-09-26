

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

//клас, який контролює вікно Start

public class Start {

    @FXML
    private Button btnCreate;

    //перехід до вікна вводу частоти натискання
    @FXML
    void Create(ActionEvent event) {
    	Stage stage = (Stage) btnCreate.getScene().getWindow();
        stage.close();
        Metod.Okno("Menu.fxml");
    }
    
    //функція виходу з програми
    @FXML
    void Exit(ActionEvent event) {
    	System.exit(0);
    }

}
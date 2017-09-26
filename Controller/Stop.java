import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Stop {

    @FXML
    void kill(ActionEvent event) {
    	Memory.bool=true;
    	System.exit(0);
    }
}
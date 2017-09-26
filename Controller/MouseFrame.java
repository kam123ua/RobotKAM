import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MouseFrame {

	@FXML
    private Button btnOK;

    @FXML
    private TextField text_n;

    @FXML
    private TextField text_k;

    @FXML
    private TextField text_m;

    @FXML
    void Run(ActionEvent event) {
    	String txt1 = text_k.getText();
    	String txt2 = text_n.getText();
    	String txt3 = text_m.getText();
    	Thread th;
    	
    	if(txt1.equals("") || txt2.equals("") || txt3.equals("")){
    		Metod.Empy();
    	}
    	
    	else if(txt3.equals("R") || txt3.equals("L")){
    		int a = Integer.parseInt(txt2);
    		Memory.n = a; 
    		a = Integer.parseInt(txt1);
    		Memory.k = a; 
    		Memory.m = txt3;
    		
    		th = new Thread(new Mouse());
    		th.start();
    		Metod.Okno("Stop.fxml");
    		
    		Stage stage = (Stage) btnOK.getScene().getWindow();
            stage.close();
    	}
    	
    	else{
    		Metod.Alert_of_input_error();
    		text_m.setText("");
    	}
    	
    }    
}
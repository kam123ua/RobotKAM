import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class KeyFrame {

    @FXML
    private Button btnOK;

    @FXML
    private TextField text_n;

    @FXML
    private TextField text_k;

    @FXML
    private TextField txt_Code;
    
    public static Thread th;

    //запуск робота
    @FXML
    void Run(ActionEvent event) {
    	String txt1 = text_k.getText();
    	String txt2 = text_n.getText();
    	String txt3 = txt_Code.getText();
    	
    	if(txt1.equals("") || txt2.equals("") || txt3.equals("")){
    		Metod.Empy();
    	}
    	
    	else{
    		int a = Integer.parseInt(txt2);
    		Memory.n = a; 
    		a = Integer.parseInt(txt1);
    		Memory.k = a; 
    		
    		th = new Thread(new Key());
    		th.start();
    		Metod.Okno("Stop.fxml");
    		
    		Stage stage = (Stage) btnOK.getScene().getWindow();
            stage.close();
    	}
    	
    	
    	
    }
     
    //отримання коду кнопки
    @SuppressWarnings("deprecation")
	@FXML
    void Key(KeyEvent e) {
    	txt_Code.setText("");
    	txt_Code.setText(""+e.getCode().getName());
    	Memory.key=e.getCode().impl_getCode();
    }
    
    
}
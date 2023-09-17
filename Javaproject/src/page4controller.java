import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class page4controller {

    @FXML
    private Button login;

    @FXML
    private TextField ptfield;

    @FXML
    private TextField utfield;

    static Stage stage2=new Stage();
   
    
    @FXML
    void btnlogin(ActionEvent event) 
    {
       String ePassword=ptfield.getText();
        String cPassword="abc";
        String eUserName=utfield.getText();
        String cUserName="abc";
        
            try 
           {
                
                if(ePassword.equals(cPassword)&&eUserName.equals(cUserName))
                {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("page3.fxml")); 
            Parent root=loader.load(); 
            stage2.setScene(new Scene(root));
            stage2.setTitle("order your food");
            stage2.show();
            App.stage1.hide();
                }
                else{
                        Alert a=new Alert(AlertType.CONFIRMATION);   // show alert box if you click on exit button
                        a.setTitle("Confirmation Message");
                        a.setContentText("Please enter valid passport or username");
                        a.showAndWait().ifPresent(response -> {
                        if(response == ButtonType.CANCEL)
                        {
                        System.exit(0);
                         }
                        });
                }

           }
            catch (Exception e) {
            System.out.println("loader class error-btnShowscreen"+e.getMessage());
           }

        }
        

    

}

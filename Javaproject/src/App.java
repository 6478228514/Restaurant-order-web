import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class App extends Application
{
    
    static Stage stage1=new Stage();

    @Override
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("page4.fxml"));
        Scene scene=new Scene(root);        
        stage1.setScene(scene);
        stage1.setTitle("login here!");
        stage1.show();  
    }
    public static void main(String[] args) {
        launch(args);
    }
}

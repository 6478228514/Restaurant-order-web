import java.io.File;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class page5controller {

    @FXML
    private Button bill;

    @FXML
    private Button home;

    @FXML
    private Button order;

    @FXML
    private TextArea tarea;

    File myfile=new File("emp.txt"); 

    @FXML
    void btnbill(ActionEvent event) 
    {
        try 
        {
            Scanner sc=new Scanner(myfile); //open the file in read mode
            if(myfile.exists())
            {
                double amt=0;
                tarea.appendText("Food"+"\t\t\t"+"Price\n");
                tarea.appendText("--------------------------------\n");

                while(sc.hasNext())
                {
                    String str=sc.next(); //read one line
                    Scanner scr=new Scanner(str);
                    scr.useDelimiter(",");
                    String name=scr.next();
                    double pr=scr.nextDouble();
                    amt=scr.nextDouble();

                    //double hr=scr.nextDouble();
                   // double salary=
                    tarea.appendText(name+"\t\t\t"+pr+"\n");
                }
                tarea.appendText("---------------------------------\n");
                tarea.appendText("Total is: \t\t\t"+amt);
            }
            else
            {
                System.out.println("file does not exist"); //use alert dial box always  
            }
            sc.close();
        }
        catch (Exception e)
        {
            System.out.println("error in file read"+e.getMessage());
        }
        

    }
    static Stage stage6=new Stage();

    @FXML
    void btnhome(ActionEvent event) 
    {
        try 
           {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("page3.fxml")); 
            Parent root=loader.load(); 
            stage6.setScene(new Scene(root));
            stage6.setTitle("order your food");
            stage6.show();
            page3controller.stage5.hide();

           }
            catch (Exception e) {
            System.out.println("loader class error-btnShowscreen"+e.getMessage());
           }

    }

    @FXML
    void btnorder(ActionEvent event) 
    {

        Alert a=new Alert(AlertType.CONFIRMATION);   // show alert box if you click on exit button
        a.setTitle("Confirmation Message");
        a.setContentText("Are you sure? You want to order!!");
        a.showAndWait().ifPresent(response -> {
            if(response == ButtonType.OK)
            {
                System.exit(0);
            }
        });
    }

}

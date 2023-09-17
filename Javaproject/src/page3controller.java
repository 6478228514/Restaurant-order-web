import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class page3controller {

    @FXML
    private Button cake;

    @FXML
    private Button fries;

    @FXML
    private Button pizza;

    @FXML
    private Button salad;

    @FXML
    private Button sand;

    @FXML
    private Button shake;
    static Stage stage4=new Stage();
    static Stage stage5=new Stage();
    File myfile=new File("emp.txt");
    //PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode
    double amt=0;

    @FXML
    void btnbill(ActionEvent event) 
    {
        try 
        {
         FXMLLoader loader=new FXMLLoader(getClass().getResource("page5.fxml")); 
         Parent root=loader.load(); 
         stage5.setScene(new Scene(root));
         stage5.setTitle("Bill");
         stage5.show();
        page4controller.stage2.hide();

        }
         catch (Exception e) {
         System.out.println("loader class error-btnShowscreen"+e.getMessage());
        }

        
    }

    @FXML
    void btncake(ActionEvent event) 
    {
        try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode
            String name="Cakes";
            double pr=5;
            amt=amt+pr;
            output.println(name+","+pr+","+amt);
            System.out.println("file crated");
            output.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in file write"+e.getMessage());
        }

    }

    @FXML
    void btnfries(ActionEvent event) 
    {
        try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode
            String name="Friess";
            double pr=20;
            amt=amt+pr;
            output.println(name+","+pr+","+amt);
            System.out.println("file crated");
            output.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in file write"+e.getMessage());
        }

    }

    @FXML
    void btnlogout(ActionEvent event) {
        try 
        {
         FXMLLoader loader=new FXMLLoader(getClass().getResource("page4.fxml")); 
         Parent root=loader.load(); 
         stage4.setScene(new Scene(root));
         stage4.setTitle("Order Food");
         stage4.show();
         page4controller.stage2.hide();

        }
         catch (Exception e) {
         System.out.println("loader class error-btnShowscreen"+e.getMessage());
        }


    }

    @FXML
    void btnpizza(ActionEvent event) 
    {
        try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode
            String name="Pizza";
            double pr=15;
            amt=amt+pr;
            output.println(name+","+pr+","+amt);
            System.out.println("file crated");
            output.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in file write"+e.getMessage());
        }
    }

    @FXML
    void btnsalad(ActionEvent event) 
    {
        try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode
            String name="Salad";
            double pr=10;
            amt=amt+pr;
            output.println(name+","+pr+","+amt);
            System.out.println("file crated");
            output.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in file write"+e.getMessage());
        }

    }

    @FXML
    void btnsand(ActionEvent event) 
    {
        try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode
            String name="Sand.";
            double pr=8;
            amt=amt+pr;
            output.println(name+","+pr+","+amt);
            System.out.println("file crated");
            output.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in file write"+e.getMessage());
        }

    }

    @FXML
    void btnshake(ActionEvent event) 
    {
        try 
        {
            PrintWriter output=new PrintWriter(new BufferedWriter(new FileWriter(myfile, true))); //append mode
            String name="Shake";
            double pr=4;
            amt=amt+pr;
            output.println(name+","+pr+","+amt);
            System.out.println("file crated");
            output.close();
        }
        catch (Exception e) 
        {
            System.out.println("error in file write"+e.getMessage());
        }

    }

}

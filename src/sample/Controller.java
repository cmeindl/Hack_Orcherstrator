package sample;

import com.example2.ScheduledPayments;
import com.example2.ScheduledPayments_Array;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {
    public TextArea LastClick;

    public Button But1;
    public Button But2;
    public TextArea Bal;


    public void Push_Pay_Click(ActionEvent actionEvent) {
       // ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();
        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        SPAClass.SendToServer(new ScheduledPayments("Wages", "033900", "90000", "Salaries", 3000000.00, "priority", "1", "2015-08-21", "open"));
        SPAClass.SendToServer(new ScheduledPayments("Aus Gov", "013900", "922000", "Customs_Duties", 9000.00, "standard", "2", "2015-08-21 14:00:00", "open"));
        SPAClass.SendToServer(new ScheduledPayments("Wages", "033900", "90000", "Salaries2", 100.00, "priority", "1", "2015-08-21", "open"));
        SPAClass.SendToServer(new ScheduledPayments("IBM", "033900", "90000", "The_MIX", 12200.00, "priority", "2", "2015-08-21", "open"));

        //SPAClass.PutAccountBalance(1.0,"AwesomeMelon","90880");
        //SPAClass.PutAccountBalance(1.0,"AwesomeMelon","90990");
        SPAClass.PutAccountBalance(5.0, "AwesomeMelon", "91000");
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());


    }

    public void But2_Click(ActionEvent actionEvent) {
        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        //ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();
//SPAClass.BuildSchedulePayArray();
   //    ArrayList<ScheduledPayments> SPARRAy =   SPAClass.BuildSchedulePayArray();
      SPAClass.ChecktoMakePayment(SPAClass.BuildSchedulePayArray(), SPAClass.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");
       // SPAClass.ChecktoMakePayment(SPAClass.BuildSchedulePayArray(), SPAClass.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");
        SPAClass.PutAccountBalance(101.0,"AwesomeMelon","90880");
        //SPAClass.PutAccountBalance(1.0,"AwesomeMelon","90990");
        SPAClass.PutAccountBalance(4.0, "AwesomeMelon", "91000");


//        //SPAClass.PutAccountBalance(4000.00,"AwesomeMelon","90210");
     Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());

    }

    public void But3_click(ActionEvent actionEvent) {
        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        SPAClass.PutAccountBalance(2000000.00, "AwesomeMelon", "90210");
        //SPAClass.PutAccountBalance(101.0,"AwesomeMelon","90880");
        SPAClass.PutAccountBalance(1996101.0,"AwesomeMelon","90990");
        //SPAClass.PutAccountBalance(4.0, "AwesomeMelon", "91000");

        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
          SPAClass.sendSMS("+61403367829", "Payment not Made to Customs");
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());
    }

    public void But4_click(ActionEvent actionEvent) {
        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());
    }


    public void But5_click(ActionEvent actionEvent) {
        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        SPAClass.ChecktoMakePayment(SPAClass.BuildSchedulePayArray(), SPAClass.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");
        SPAClass.PutAccountBalance(9101.0,"AwesomeMelon","90880");
        //SPAClass.PutAccountBalance(1996101.0,"AwesomeMelon","90990");
        SPAClass.PutAccountBalance(3.0, "AwesomeMelon", "91000");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());
    }


    public void But6_click(ActionEvent actionEvent) {
        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        SPAClass.PutAccountBalance(6000000.00, "AwesomeMelon", "90210");
       // SPAClass.PutAccountBalance(9101.0,"AwesomeMelon","90880");
        SPAClass.PutAccountBalance(6005101.00,"AwesomeMelon","90990");
       // SPAClass.PutAccountBalance(3.0, "AwesomeMelon", "91000");




        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());
    }

    public void But7_click(ActionEvent actionEvent) {

        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();


        SPAClass.ChecktoMakePayment(SPAClass.BuildSchedulePayArray(), SPAClass.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");
        SPAClass.PutAccountBalance(3021301.0, "AwesomeMelon", "90880");
       // SPAClass.PutAccountBalance(9005101.00,"AwesomeMelon","90990");
        SPAClass.PutAccountBalance(1.0, "AwesomeMelon", "91000");
        ScheduledPayments_Array SPAClass2 = new ScheduledPayments_Array();
        SPAClass2.ChecktoMakePayment(SPAClass2.BuildSchedulePayArray(), SPAClass2.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());
    }

    public void Cleanup_Click(ActionEvent actionEvent) {
        ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        SPAClass.DeleteSched("AwesomeMelon","Salaries");
        SPAClass.DeleteSched("AwesomeMelon","Salaries2");
        SPAClass.DeleteSched("AwesomeMelon", "Customs_Duties");
        SPAClass.DeleteSched("AwesomeMelon","The_MIX");
        SPAClass.DeleteSched("AwesomeMelon","Make_sure_We_Win");
        SPAClass.PutAccountBalance(4000.00, "AwesomeMelon", "90210");
        SPAClass.PutAccountBalance(1.0, "AwesomeMelon", "90880");
        SPAClass.PutAccountBalance(1.0,"AwesomeMelon","90990");
        SPAClass.PutAccountBalance(1.0, "AwesomeMelon", "91000");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        Button button = (Button)actionEvent.getSource();
        LastClick.setText(button.getText().toString());
    }
}

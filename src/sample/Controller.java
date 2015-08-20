package sample;

import com.example2.ScheduledPayments;
import com.example2.ScheduledPayments_Array;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller {
    ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

    public Button But1;
    public Button But2;
    public TextArea Bal;


    public void Push_Pay_Click(ActionEvent actionEvent) {
       // ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();
        SPAClass.PutAccountBalance(4000.00,"AwesomeMelon","90210");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
        SPAClass.SendToServer(new ScheduledPayments("Wages", "033900", "90000", "4_The_Wage_Slaves", 3000000.00, "priority", "1", "2015-08-20", "open"));
        SPAClass.SendToServer(new ScheduledPayments("Aus Gov", "013900", "922000", "Customs", 9000.00, "standard", "2", "2015-08-20 14:00:00", "open"));
        SPAClass.SendToServer(new ScheduledPayments("Wages", "033900", "90000", "4_The_Wage_Slaves-SMALL", 100.00, "priority", "1", "2015-08-20", "open"));
        SPAClass.SendToServer(new ScheduledPayments("IBM", "033900", "90000", "The MIX", 12200.00, "priority", "2", "2015-08-20", "open"));


    }

    public void But2_Click(ActionEvent actionEvent) {
        //ScheduledPayments_Array SPAClass = new ScheduledPayments_Array();

        SPAClass.ChecktoMakePayment(SPAClass.BuildSchedulePayArray(), SPAClass.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");
        //SPAClass.PutAccountBalance(4000.00,"AwesomeMelon","90210");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());

    }

    public void But3_click(ActionEvent actionEvent) {
        SPAClass.PutAccountBalance(2000000.00,"AwesomeMelon","90210");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());

    }

    public void But4_click(ActionEvent actionEvent) {
      //  SPAClass.sendSMS("+61403367829", "Payment not Made to Customs");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
    }

    public void But5_click(ActionEvent actionEvent) {
        SPAClass.ChecktoMakePayment(SPAClass.BuildSchedulePayArray(), SPAClass.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");
        Bal.setText(SPAClass.GetAccountBalance("AwesomeMelon", "90210").toString());
    }

    public void But6_click(ActionEvent actionEvent) {
        SPAClass.PutAccountBalance(12000000.00,"AwesomeMelon","90210");
    }

    public void But7_click(ActionEvent actionEvent) {
        SPAClass.ChecktoMakePayment(SPAClass.BuildSchedulePayArray(), SPAClass.GetAccountBalance("AwesomeMelon", "90210"), "AwesomeMelon", "90210");


    }
}

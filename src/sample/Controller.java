package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    ArrayList<String> numbers = new ArrayList<String>();
    @FXML
    public TextField talDisplay;

    public void plusM(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        System.out.println("resultknap virker!" + s);
        numbers.add(s);
        talDisplay.clear();


    }
    public void equalM(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        numbers.add(s);
        talDisplay.clear();
        System.out.println(s + " er nutilføjet");
        for (String number: numberArray);
        System.out.println(numbers);
        result += Integer.parseInt(numbers)

    }
}

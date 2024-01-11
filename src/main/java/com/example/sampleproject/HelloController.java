package com.example.sampleproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textFieldA;
    @FXML
    private TextField textFieldB;

    @FXML
    private Label resultLabel;

    Double getA(TextField textField){
        return Double.parseDouble(textField.getText());
    }
    Double getB(TextField textField){
        return Double.parseDouble(textField.getText());
    }

    @FXML
    void add(ActionEvent e){
        double res = getA(textFieldA) + getB(textFieldB);
        resultLabel.setText("Result : " + res);
    }

    @FXML
    void subtract(ActionEvent e){
        double res = getA(textFieldA) - getB(textFieldB);
        resultLabel.setText("Result : " + res);
    }

    @FXML
    void multiply(ActionEvent e){
        double res = getA(textFieldA) * getB(textFieldB);
        resultLabel.setText("Result : " + res);
    }

    @FXML
    void divide(ActionEvent e){
        double res =(double)(getA(textFieldA)/getB(textFieldB));
        resultLabel.setText("Result : " + res);
    }

}
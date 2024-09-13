package com.example.csc311_lab02;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField annualInterestRate;
    @FXML
    private TextField numberOfYears;
    @FXML
    private TextField loanAmount;
    @FXML
    private TextField monthlyPayment;
    @FXML
    private TextField totalPayment;
    double interest;
    int years;
    double loan;
    double monthly;
    double total;

    public void calculate(ActionEvent event){
        years = Integer.parseInt(numberOfYears.getText());
        interest = Double.parseDouble(annualInterestRate.getText());
        loan = Double.parseDouble(loanAmount.getText());

    }


    }
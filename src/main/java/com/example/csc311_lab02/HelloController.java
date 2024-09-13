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
    double numerator;
    double denominator;
    int totalMonths;
    double monthlyInterestRate;

    public void calculate(ActionEvent event){
        years = Integer.parseInt(numberOfYears.getText());
        interest = Double.parseDouble(annualInterestRate.getText()) / 100;
        loan = Double.parseDouble(loanAmount.getText());
        monthlyInterestRate = interest/12;
        totalMonths = years * 12;
        numerator = loan * monthlyInterestRate;
        denominator = 1-Math.pow(1+monthlyInterestRate,-totalMonths);
        monthly = numerator/denominator;
        total = monthly * totalMonths;
        monthlyPayment.setText(String.format("$%.2f",monthly));
        totalPayment.setText(String.format("$%.2f",total));
    }


    }
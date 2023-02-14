package com.example.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorControllerG {

    public void start() {
        String toPrint;
        try {
            String choice = "1";
            while(choice != "0") {
                String firstAddendum;
                String secondAddendum;
                String operation;

                String printFirstAddendum = "Insert first addendum: ";
                String printSecondAddendum = "Insert second addendum: ";
                CalculatorController calculatorController = new CalculatorController();
                CalculatorBean calculatorBean = new CalculatorBean();
                askPrint("Choose operations: 0 for '+', 1 for '-', 2 for '/', 3 for '*', 4 for natural logarithm, 5 for square :");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                operation = reader.readLine();
                calculatorBean.setOperation(operation);
                switch (operation) {
                    case "0":
                        askPrint(printFirstAddendum);
                        firstAddendum = reader.readLine();
                        askPrint(printSecondAddendum);
                        secondAddendum = reader.readLine();
                        calculatorBean.setFirstAddendum(firstAddendum);
                        calculatorBean.setSecondAddendum(secondAddendum);
                        LinePrinter.print(String.valueOf(calculatorController.addition(calculatorBean)));
                        break;
                    case "1":
                        askPrint(printFirstAddendum);
                        firstAddendum = reader.readLine();
                        askPrint(printSecondAddendum);
                        secondAddendum = reader.readLine();
                        calculatorBean.setFirstAddendum(firstAddendum);
                        calculatorBean.setSecondAddendum(secondAddendum);
                        LinePrinter.print(String.valueOf(calculatorController.subtraction(calculatorBean)));
                        break;
                    case "2":
                        askPrint(printFirstAddendum);
                        firstAddendum = reader.readLine();
                        askPrint(printSecondAddendum);
                        secondAddendum = reader.readLine();
                        calculatorBean.setFirstAddendum(firstAddendum);
                        calculatorBean.setSecondAddendum(secondAddendum);
                        if (calculatorBean.validation()) {
                            LinePrinter.print(String.valueOf(calculatorController.division(calculatorBean)));
                        } else {
                            toPrint = "Impossible division";
                            LinePrinter.print(toPrint);
                        }
                        break;
                    case "3":
                        askPrint(printFirstAddendum);
                        firstAddendum = reader.readLine();
                        askPrint(printSecondAddendum);
                        secondAddendum = reader.readLine();
                        calculatorBean.setFirstAddendum(firstAddendum);
                        calculatorBean.setSecondAddendum(secondAddendum);
                        LinePrinter.print(String.valueOf(calculatorController.multiply(calculatorBean)));
                        break;
                    case "4":
                        askPrint(printFirstAddendum);
                        firstAddendum = reader.readLine();
                        calculatorBean.setFirstAddendum(firstAddendum);
                        if (calculatorBean.validation()) {
                            LinePrinter.print(String.valueOf(calculatorController.logarithm(calculatorBean)));
                        } else {
                            toPrint = "Impossible logarithm";
                            LinePrinter.print(toPrint);
                        }
                        break;

                    case "5":
                        askPrint(printFirstAddendum);
                        firstAddendum = reader.readLine();
                        calculatorBean.setFirstAddendum(firstAddendum);
                        if (calculatorBean.validation()) {
                            LinePrinter.print(String.valueOf(calculatorController.square(calculatorBean)));
                        } else {
                            toPrint = "Impossible square";
                            LinePrinter.print(toPrint);
                        }
                        break;
                    default:
                        askPrint("No operations allowed. Closing app");
                        break;
                }
                toPrint = "Press 0 to close calculator, anything to restart";
                LinePrinter.print(toPrint);
                choice = reader.readLine();
            }
        } catch (IOException e) {
            toPrint = "Something went wrong. Closing app. . .";
            LinePrinter.print(toPrint);
        }

    }

    private void askPrint(String toPrint) {
        LinePrinter.print(toPrint);
    }
}

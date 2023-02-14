package com.example.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorControllerG {

    public void start() {
        String toPrint;
        try {
            String choice = "1";
            while(!choice.equals("0")) {
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
                        division(calculatorBean, String.valueOf(calculatorController.division(calculatorBean)), "Impossible division");
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
                        division(calculatorBean, String.valueOf(calculatorController.logarithm(calculatorBean)), "Impossible logarithm");
                        break;

                    case "5":
                        askPrint(printFirstAddendum);
                        firstAddendum = reader.readLine();
                        calculatorBean.setFirstAddendum(firstAddendum);
                        division(calculatorBean, String.valueOf(calculatorController.square(calculatorBean)), "Impossible square");
                        break;
                    default:
                        askPrint("No operations allowed");
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

    private static void division(CalculatorBean calculatorBean, String calculatorController, String toPrint1) {
        String toPrint2;
        if (calculatorBean.validation()) {
            LinePrinter.print(calculatorController);
        } else {
            toPrint2 = toPrint1;
            LinePrinter.print(toPrint2);
        }
    }

    private void askPrint(String toPrint) {
        LinePrinter.print(toPrint);
    }
}

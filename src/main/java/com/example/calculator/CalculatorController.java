package com.example.calculator;
public class CalculatorController {


    public float addition(CalculatorBean calculatorBean) {
        return Float.parseFloat(calculatorBean.getFirstAddendum()) + Float.parseFloat(calculatorBean.getSecondAddendum());
    }

    public float subtraction(CalculatorBean calculatorBean) {
        return Float.parseFloat(calculatorBean.getFirstAddendum()) - Float.parseFloat(calculatorBean.getSecondAddendum());
    }


    public float division(CalculatorBean calculatorBean) {
        return Float.parseFloat(calculatorBean.getFirstAddendum()) / Float.parseFloat(calculatorBean.getSecondAddendum());
    }

    public float multiply(CalculatorBean calculatorBean) {
        return Float.parseFloat(calculatorBean.getFirstAddendum()) * Float.parseFloat(calculatorBean.getSecondAddendum());
    }

    public double logarithm(CalculatorBean calculatorBean) {
        return Math.log(Double.parseDouble(calculatorBean.getFirstAddendum()));
    }

    public double square(CalculatorBean calculatorBean) {
        return Math.sqrt(Double.parseDouble(calculatorBean.getFirstAddendum()));
    }
}

package com.example.calculator;

public class CalculatorBean {



    private String firstAddendum;
    private String secondAddendum;
    private String operation;

    public boolean validation(){
        if(operation.equals("2")){
            if(secondAddendum.substring(0,1).equals("0")){
                return false;
            }
        }
        if(operation.equals("4") || operation.equals("5")){
            if (Float.parseFloat(firstAddendum) <= 0){
                return false;
            }
        }
        return true;
    }

    public String getFirstAddendum() {
        return firstAddendum;
    }

    public void setFirstAddendum(String firstAddendum) {
        this.firstAddendum = firstAddendum;
    }

    public String getSecondAddendum() {
        return secondAddendum;
    }

    public void setSecondAddendum(String secondAddendum) {
        this.secondAddendum = secondAddendum;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }


}

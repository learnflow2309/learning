package com.pluralsight.calcengine.withspecializedclasses;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal(){return leftVal;}
    public void setLeftVal(double leftVal) {this.leftVal = leftVal;}
    public double getRightVal(){return rightVal;}
    public void setRightVal(double rightVal) {this.rightVal = rightVal;}
    public double getResult(){return rightVal;}
    public void setResult(double rightVal) {this.rightVal = rightVal;}

    public CalculateBase(){}
    public CalculateBase(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}

package com.pluralsight.calcengine.classesandmethods;

public class CalcEngineClassesAndMethods {
    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];

        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(100.0d, 50.0d, 'a');
        equations[2] = create(100.0d, 50.0d, 's');
        equations[3] = create(100.0d, 50.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("results = ");
            System.out.println(equation.result);
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;
    }
}
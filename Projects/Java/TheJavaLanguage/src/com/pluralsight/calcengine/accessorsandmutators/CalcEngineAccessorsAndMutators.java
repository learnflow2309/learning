package com.pluralsight.calcengine.accessorsandmutators;

public class CalcEngineAccessorsAndMutators {
    public static void main(String[] args) {
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];

        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(100.0d, 50.0d, 'a');
        equations[2] = create(100.0d, 50.0d, 's');
        equations[3] = create(100.0d, 50.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("results = ");
            System.out.println(equation.getResult());
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);
        return equation;
    }
}
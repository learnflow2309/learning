package com.pluralsight.calcengine;

public class CalcEngine {
    public static void main(String[] args) {
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        double[] results = new double[opCodes.length];

//        for (int i = 0; i < opCodes.length; i++){
//            if (opCodes[i] == 'a')
//                results[i] = leftVals[i] + rightVals[i];
//            else if (opCodes[i] == 's')
//                results[i] = leftVals[i] - rightVals[i];
//            else if (opCodes[i] == 'd') {
//                results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
//            } else if (opCodes[i] == 'm')
//                results[i] = leftVals[i] * rightVals[i];
//            else {
//                System.out.println("Error - invalid opCode");
//                results[i] = 0.0d;
//            }
//        }

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]){
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:
                    System.out.println("Error - invalid opCode");
                    results[i] = 0.0d;
                    break;
            }
        }

        for (double theResult : results) {
            System.out.print("results = ");
            System.out.println(theResult);
        }

    }
}
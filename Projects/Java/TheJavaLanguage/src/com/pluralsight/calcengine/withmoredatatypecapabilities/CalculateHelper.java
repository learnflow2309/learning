package com.pluralsight.calcengine.withmoredatatypecapabilities;

public class CalculateHelper {
    public static final char ADD_SYMBOL = '+';
    public static final char SUBTRACT_SYMBOL = '-';
    public static final char MULTIPLY_SYMBOL = '*';
    public static final char DIVIDE_SYMBOL = '/';

    MathCommand command;
    double leftValue;
    double rightValue;
    double result;

    public void process(String statement){
        //add 1.0 2.0
        String[] parts = statement.split(" ");
        String commandString = parts[0]; //add
        leftValue = Double.parseDouble(parts[1]); //1.0
        rightValue = Double.parseDouble(parts[2]); //2.0

        setCommandFromString(commandString);

        CalculateBase calculator = null;
        switch (command){
            case Add:
                calculator = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                calculator = new Subtracter(leftValue, rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue, rightValue);
                break;
            case Divide:
                calculator = new Divider(leftValue, rightValue);
                break;
            default:
                System.out.println("Wrong command 1st error");
        }

        calculator.calculate();
        result = calculator.getResult();
    }

    private void setCommandFromString(String commandString){
        // add -> MathCommand.add
        if(commandString.equalsIgnoreCase(MathCommand.Add.toString())){
            command = MathCommand.Add;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Subtract.toString())){
            command = MathCommand.Subtract;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString())){
            command = MathCommand.Multiply;
        }
        else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString())){
            command = MathCommand.Divide;
        }
    }

    @Override
    public String toString(){
        //1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch (command){
            case Add:
                //symbol = '+';
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
            default:
                System.out.println("Wrong command 2nd error");
        }

        StringBuilder sb = new StringBuilder(20);
        sb.append(leftValue);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightValue);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();

    }
}

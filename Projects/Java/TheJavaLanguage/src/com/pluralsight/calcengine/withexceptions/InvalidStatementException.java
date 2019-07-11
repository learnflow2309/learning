package com.pluralsight.calcengine.withexceptions;

public class InvalidStatementException extends Exception{
    public InvalidStatementException(String reason, String statement){
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason + ": " + statement, cause);
    }
}
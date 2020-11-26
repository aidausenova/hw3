package com.company;

public class LimitException extends Exception{


    private String message;
    private double remainingAmount;

    public LimitException(String cause, double remainingAmount) {
        super(cause);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}

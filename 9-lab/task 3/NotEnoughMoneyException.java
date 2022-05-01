package com.company;

public class NotEnoughMoneyException extends Throwable {
    public NotEnoughMoneyException(String errorMessage){
        super(errorMessage);
    }
}

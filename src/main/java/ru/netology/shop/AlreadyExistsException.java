package ru.netology.shop;

public class AlreadyExistsException extends RuntimeException {
    public AlreadyExistsException (String s) {
        super(s);
    }
}


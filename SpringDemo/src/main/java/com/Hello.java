package com;

public class Hello {
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }
    public void showMessage() {
        System.out.println("Hello : " + message);
    }
}

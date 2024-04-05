package org.example;

class OperationImpl implements Operation {

    public int count(String text) {
        return text.length();
    }
}
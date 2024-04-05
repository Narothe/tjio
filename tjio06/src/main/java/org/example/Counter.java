package org.example;

class Counter {

    private final Operation operation;

    public Counter(Operation operation) {
        this.operation = operation;
    }

    int countCharacters(String text) {
        return operation.count(text);
    }
}
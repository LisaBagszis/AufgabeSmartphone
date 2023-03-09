package org.example;

public abstract class Contact {

    protected String name;

    public Contact() {}

    public Contact(String name) {
        this.name = name;
    }

    public abstract String getName();
}


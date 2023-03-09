package org.example;

public class Friend extends Contact {

    protected String phoneNumber;




    public Friend() {

    }

    public Friend(String name, String phoneNumber) {
        super.name = name;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

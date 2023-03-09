package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements positionable, startAndstoppable {

protected String model;
protected String manufacturer;

protected ArrayList<Contact> contactList;

public Smartphone () {}

    public Smartphone(String model, String manufacturer, ArrayList<Contact> contactList) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contactList = contactList;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;

    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return true;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contactList=" + contactList +
                '}';
    }
}

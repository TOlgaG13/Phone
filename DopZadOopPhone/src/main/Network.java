package main;

import java.util.ArrayList;
import java.util.List;

public class Network {
	private List<Phone> registeredPhones = new ArrayList<>();

    public void registerNumber(Phone phone) {
        if (!isNumberRegistered(phone.getPhoneNumber())) {
            registeredPhones.add(phone);
            phone.setRegistered(true);
            phone.setNetwork(this);
            System.out.println("Number " + phone.getPhoneNumber() + " is registered in the network.");
        } else {
            System.out.println("Number " + phone.getPhoneNumber() + " is already registered.");
        }
    }

    public boolean isNumberRegistered(String phoneNumber) {
        return findPhoneByNumber(phoneNumber) != null;
    }

    public Phone findPhoneByNumber(String phoneNumber) {
        for (Phone phone : registeredPhones) {
            if (phone.getPhoneNumber().equals(phoneNumber)) {
                return phone;
            }
        }
        return null;
    }
}

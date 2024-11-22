package main;

public class Phone {
	private String phoneNumber;
    private Network network;
    private boolean isRegistered = false;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void registerInNetwork(Network network) {
        this.network = network;
        network.registerNumber(this);
    }

    public void makeCall(String targetNumber) {
        if (!isRegistered) {
            System.out.println("Phone with number " + this.phoneNumber + " is not registered in the network.");
            return;
        }

        Phone targetPhone = network.findPhoneByNumber(targetNumber);
        if (targetPhone != null) {
            System.out.println("Calling " + targetNumber + " from " + this.phoneNumber + "...");
            targetPhone.receiveCall(this.phoneNumber);
        } else {
            System.out.println("The number " + targetNumber + " is not registered in the network.");
        }
    }

    public void receiveCall(String fromNumber) {
        System.out.println("You are receiving a call from number " + fromNumber);
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }
}

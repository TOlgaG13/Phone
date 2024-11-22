package main;

public class NumberReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network network = new Network();

		Phone phone1 = new Phone("0967453333");
		Phone phone2 = new Phone("0754562211");
		Phone phone3 = new Phone("0453459999");

		phone1.registerInNetwork(network);
		phone2.registerInNetwork(network);

		phone1.makeCall("0453459999");

		phone3.registerInNetwork(network);
		phone1.makeCall("0453459999");
	}
}

package src;

public class Car extends Vehicle{
	
private int numberOfDoors;


public int getNumberOfDoors() {
	return numberOfDoors;
}


public void setNumberOfDoors(int Doors) {
	this.numberOfDoors = Doors;
}


void openTrunk() {
	System.out.println("tunk opened.");
}

}

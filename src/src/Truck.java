package src;

public class Truck extends Vehicle {
	
int NumberOfAxles;
private int capacityInTons;

public int getCapacityInTons() {
	return capacityInTons;
}

public void setCapacityInTons(int capacity) {
	this.capacityInTons = capacity;
}

void load(int weightOfTheLoad) {
	System.out.println("Loaded " +(weightOfTheLoad)+ "tons.");
}
}

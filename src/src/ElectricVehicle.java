package src;

public class ElectricVehicle extends Vehicle {
int batteryCapacity;
int chargeLevel;

void charge() {
	chargeLevel ++;
}

@Override
void drive(int noOfMilesDriven) {
	System.out.println("Electric vehicle driven " +(noOfMilesDriven)+ "miles");
}
}

package src;

public class Vehicle extends Engine implements Honkable{
	
String make;
String model;
private int year;
String color;
int numberOfWheels;
int weight;

public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
void start() {
	System.out.print("Vehicle started");
}
void stop() {
	System.out.print("Vehicle stopped");
}
void drive(int noOfMilesDriven) {
	System.out.print("Vehicle driven " + (noOfMilesDriven)+ " miles");
}
public void honk() {
	System.out.print("Honk Honk!");
}
void startEngine() {
	
	System.out.print("Engine Started");
}

}


package src;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car();
	
		myCar.start();
		System.out.print("\n");
		myCar.stop();
		System.out.print("\n");
		myCar.drive(34);
		System.out.print("\n");
		myCar.startEngine();
		System.out.print("\n");
		myCar.honk();

	}

}

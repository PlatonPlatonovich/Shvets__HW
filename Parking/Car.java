package Parking;

import java.util.Random;

public class Car {
	private int RandomCar;
	
	public Car () {
		Random rnd = new Random();
		this.setRandomCar (rnd.nextInt(9999));
	}
	
	public Car (int RandomCar) {
		this.setRandomCar(RandomCar);
	}
	
	public int getRandomCar () {
		return RandomCar;
	}
	
	public void setRandomCar (int RandomCar) {
		this.RandomCar = RandomCar;
	}
	
	public String toString () {
		return String.format ("\n%s", getRandomCar());
	}
}

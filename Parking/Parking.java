package Parking;
import java.util.ArrayList;
import java.util.Random;

public class Parking {
		int parkingID =0;
		Car newCar = new Car ();
		
	public Parking () {
	}
	
	public ArrayList addAuto (ArrayList newParking) {
		outer: for (int i=1;i<newParking.size();i++) {
			inner: if (newParking.contains(i-1) == false) {
				Car newCar = new Car ();
				parkingID = i;
				break outer;
			}
			else if (i == newParking.size() && newParking.contains(i-1) == false) {
				parkingID = i++;
				Car newCar = new Car ();
			}
			else {
				break inner;
			}
		}
		newParking.add(parkingID, newCar);
	return newParking;
	}
	
	public void removeCar (ArrayList newParking) {
		Random rnd = new Random();
		int leavingCar = rnd.nextInt ();
	}
	
	public String toString () {
		return String.format ("\n%d:\t %s", parkingID, newCar);
	}
	
	public static void main (String [] args) {
		ArrayList newParking = new ArrayList ();
		Parking x = new Parking();
		for (int i =0; i<=10; i++) {
			x.addAuto (newParking);
			}
		System.out.println (newParking);
		}

}


/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
 * Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". 
 * Create an object of the Car class and call both the "drive" and "honk" methods.*/
package inheritance;
class Vehicle
{
	String brand;
	String model;
	int year;
	void drive() {
		System.out.println("Driving...");
	}
}
class Car extends Vehicle
{
	String color;
	void honk() {
		System.out.println("Honking...");
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car c=new Car();
    c.drive();
    c.honk();
	}

}

/*Output:
 * Driving...
Honking...*/

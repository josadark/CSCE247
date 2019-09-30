
/*
 * Car class will create a car thru three methods to demonstrate factory design
 */
public class Car extends Toy {

	public Car() {
		super.name = "Car";
		assemble();
		boxToy();
		priceToy();
	}
	
	@Override
	public void assemble() {
		System.out.println("Putting together a Car");
		System.out.println("Make the body");
		System.out.println("Add the wheels");
		System.out.println("Paint the car");
		//assembly dialogue for constructing the toy

	}

	@Override
	public void boxToy() {
		//boxing dialogue for boxing toy
		System.out.println("Putting the car in a box");

	}

	@Override
	public void priceToy() {
		//pricing dialogue for pricing toy
		System.out.println("Adding price on car");

	}

}

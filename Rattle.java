/*
 * Rattle class will create a rattle thru three methods to demonstrate factory design
 */
public class Rattle extends Toy {

	public Rattle() {
		super.name = "Rattle";
		assemble();
		boxToy();
		priceToy();
	}
	
	@Override
	public void assemble() {
		System.out.println("Putting together a Rattle");
		System.out.println("Create the frame");
		System.out.println("Add the pebbles");
		System.out.println("Secure the sides");
		//assembles rattle

	}

	@Override
	public void boxToy() {
		//box toy
		System.out.println("Putting the rattle  in a box");

	}

	@Override
	public void priceToy() {
		//add price to toy
		System.out.println("Adding price on Rattle");

	}

}


/*
 * Doll class will create a Doll thru three methods to demonstrate factory design
 */
public class Doll extends Toy {

	public Doll() {
		super.name = "Doll";
		assemble();
		boxToy();
		priceToy();
	}
	
	@Override
	public void assemble() {
		System.out.println("Putting together a Doll");
		System.out.println("Connect all the pieces");
		System.out.println("Paint the face");
		System.out.println("Add the dress");
		System.out.println("Add the shoes");
		//assembly dialogue for toy

	}

	@Override
	public void boxToy() {
		//boxing dialogue for toy
		System.out.println("Putting the doll in a box");

	}

	@Override
	public void priceToy() {
		//pricing dialogue for toy
		System.out.println("Adding price on doll");

	}

}

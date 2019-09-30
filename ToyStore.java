/*
 * JOSHUA DARK
 * CSCE 247
 * 9/29/2019 13:01
 * The ToyStore assingment should demonstrate a factory design pattern that creates
 * new toys from a string passed into a ToyStore (factory) class.
 */


/*
 * factory class to distinguish between strings and create toys accordingly
 */
public class ToyStore {

	public ToyStore() {
		
	}
	
	public Toy orderToy(String toy){//takes in string, returns toy object
		
		switch(toy) {
		case "doll":
			return new Doll();
		case "car":
			return new Car();
		case "rattle":
			return new Rattle();
		}
		
		return null;
		
	}
	
}

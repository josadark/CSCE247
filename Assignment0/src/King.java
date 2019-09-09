/*
 * JOSHUA DARK
 * CSCE 247
 * SECTION 001
 * 
 */
public class King extends Character {

	public King(String name) {
		super(name); //call super
		setWeaponBehavior(new WeaponSword()); //set weapons
	}
	
	public void display() { //print name and description
		System.out.println(name+" is a Noble King");
	}

}

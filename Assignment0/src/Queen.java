/*
 * JOSHUA DARK
 * CSCE 247
 * SECTION 001
 * 
 */
public class Queen extends Character {

	public Queen(String name) {
		super(name); //call super
		setWeaponBehavior(new WeaponKnife());//set weapon
	}
	
	public void display() { //print name and description
		System.out.println(name+" is a beautiful queen");
	}

}

/*
 * JOSHUA DARK
 * CSCE 247
 * SECTION 001
 * 
 */
public class Troll extends Character {

	public Troll(String name) {
		super(name);//call super
		setWeaponBehavior(new WeaponAxe());//set weapon
	}
	
	public void display() { //print name and description
		System.out.println(name+" is a funny troll");
	}

}

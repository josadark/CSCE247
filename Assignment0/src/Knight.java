/*
 * JOSHUA DARK
 * CSCE 247
 * SECTION 001
 * 
 */
public class Knight extends Character {

	public Knight(String name) {
		super(name); //call super
		setWeaponBehavior(new WeaponBow());//set weapon
		// TODO Auto-generated constructor stub
	}

	public void display() { //print name and description
		System.out.println(name+" is a valiant knight");
	}
	
}

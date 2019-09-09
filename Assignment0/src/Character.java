/*
 * JOSHUA DARK
 * CSCE 247
 * SECTION 001
 * 
 */
public abstract class Character {

  protected String name; //title of character
  WeaponBehavior weaponBehavior; //weapon of character
  
  //Constructor with string parameter for name (called by sub)
  public Character(String name) {
    this.name = name; 
  }
  //void attack, overwritten by subs
  public void attack() {
    weaponBehavior.attack();
  }
  //void method called in sub constructors and driver
  public void setWeaponBehavior(WeaponBehavior aWeaponBehavior) {
    weaponBehavior = aWeaponBehavior;
  }
  //print name field
  public void display() {
    System.out.print(name + " ");
  }
}
 
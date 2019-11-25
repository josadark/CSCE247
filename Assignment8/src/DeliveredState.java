
public class DeliveredState implements State{

	Package pkg;
	
	public DeliveredState(Package pkg) {
		this.pkg = pkg;
	}

	public void displayStatus() {
		System.out.println(pkg.getName()+" is here for you");
		
	}

	public void displayETA() {
		System.out.println(pkg.getName()+" is here");
		
	}
	
}

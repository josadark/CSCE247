/*
 * JOSHUA DARK
 * CSCE 247
 * ASSIGNMENT 08
 * STATE STYLE
 * 
 * This program uses a state interface to switch between three possible states for a package being delivered
 * 
 * 
 */
public class Package {
	//name of package
	private String name;
	//state of package
	private State state;
	//orderedState
	private State orderedState;
	//intransit state
	private State inTransitState;
	//delivered state
	private State deliveredState;
	
	//constructor which takes in the string name of package
	public Package(String contents) {
		this.name = contents;
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
	}
	//order method which sets state to ordered and displays
	public void order() {
		setState(orderedState);
		state.displayETA();
		state.displayStatus();
	}
	//mail method which sets state to inTransit and displays
	public void mail() {
		setState(inTransitState);
		state.displayETA();
		state.displayStatus();
	}
	//received method which sets state to delivered and displays
	public void received() {
		setState(deliveredState);
		state.displayStatus();
	}
	//setState private helper method
	private void setState(State state) {
		this.state = state;
	}
	//setName mutator
	public void setName(String name) {
		this.name = name;
	}
	//getName acessor
	public String getName() {
	return name;
	}
	
	
	
}

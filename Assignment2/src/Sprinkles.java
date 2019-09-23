
public class Sprinkles extends ToppingsDecorator{
	
	IceCream ic;
	
	public Sprinkles(IceCream ic) {//takes in icecream parameter
		this.ic = ic;
	}
	
	public String toString() {//returns description
		return ic.toString()+"+ sprinkles";
	}
	
	public double getCost() {//returns cost
		return .4;
	}
}

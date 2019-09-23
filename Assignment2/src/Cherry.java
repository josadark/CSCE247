
public class Cherry extends ToppingsDecorator{

	IceCream ic;
	
	public Cherry(IceCream ic) {//takes in icecream parameter
		this.ic = ic;
	}
	
	public String toString() {//returns description
		return ic.toString()+"+ a cherry on top";
	}
	
	public double getCost() {//returns cost
		return .4;
	}
	
}

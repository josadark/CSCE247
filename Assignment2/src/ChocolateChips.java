public class ChocolateChips extends ToppingsDecorator{

	IceCream ic;
	
	public ChocolateChips(IceCream ic) {
		this.ic = ic;
	}
	
	public String toString() {
		return ic.toString()+"+ chocolate chips";
	}
	
	public double getCost() {
		return .3;
	}
	
}

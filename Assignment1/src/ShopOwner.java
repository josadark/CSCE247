
public class ShopOwner implements Observer{

	public ShopOwner(Watchman watchman) {
		watchman.registerObserver(this); // add this observer to watchman's list
	}

	@Override
	public void update(int warning) { // recieve call
		if(warning==1) {
			System.out.println("Shop Owner: Close down shop and head home");
		}else {
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
		}
		
	}
		
	}



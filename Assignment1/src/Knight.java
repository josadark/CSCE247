
public class Knight implements Observer {

	public Knight(Watchman watchman) {
		watchman.registerObserver(this);//register this observer to watchman's arraylist
	}

	@Override
	public void update(int warning) {//recieve message
		if(warning==1) {
			System.out.println("Knight: Helps everyone get home safe");
		}else {
			System.out.println("Knight: Prepares for battle");
		}
		
	}

}

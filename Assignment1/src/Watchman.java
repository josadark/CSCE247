import java.util.ArrayList;

public class Watchman implements Subject{//implements Subject

	ArrayList<Observer> Observers;//dec;arean arraylistof observers
	
	public Watchman() {
		Observers = new ArrayList();//instantiate an arraylist of observers
	}
	
	@Override
	public void registerObserver(Observer observer) {
		Observers.add(observer);
		// adds an observer parameter to the java arraylist
		
	}

	@Override
	public void removeObserver(Observer observer) {
		//removes the observer from the java arraylist
		Observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
	}
	
	public void issueWarning(int warning) {
		//calls each observer's update method with the number of warnings
		System.out.println("WARNING: "+warning+" trumpets were played!"); // displayed for user
		for(int i=0; i<Observers.size();i++) { //loop thru 
			Observers.get(i).update(warning); //update Observ
		}
	}

	
}

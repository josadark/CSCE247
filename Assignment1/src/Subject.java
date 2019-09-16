
public interface Subject {
	
	void registerObserver(Observer observer);//will add an observer
	void removeObserver(Observer observer);//will remove an observer
	void notifyObservers();//notifies all observers!

}

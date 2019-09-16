
public class Teacher implements Observer{

	public Teacher(Watchman watchman) {
		watchman.registerObserver(this); //add this observer to watchman list
	}

	@Override
	public void update(int warning) { // receive notifications
		if(warning==1) {
			System.out.println("Teacher: Helps get every kid home safe");
		}else {
			System.out.println("Teacher: Brings all the students to the underfound shelter");
		}
		
	}

}

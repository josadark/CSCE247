/*House Class
 *Base class with template buildHouse method
 *Joshua Dark
 *CSCE 247
 *Assignment 07
 *Template design pattern
 */
public class House {

	public House() {
		
	}
	//House constructor, default
	public void buildHouse() {
		prepFoundation();
		createFrame();
		installDrywall();
		addWindows();
		addElectrical();
		addPlumbing();
	}
	//build house template methodology
	public void createFrame() {
		
	}
	//create frame method, overridden by subclasses
	public void prepFoundation() {
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	//prints unique dialogue
	public void installDrywall() {
		System.out.println("Drywall: Creating the interior walls");
	}
	//prints unique dialogue
	public void addWindows() {
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	//prints unique dialogue
	public void addElectrical() {
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}
	//prints unique dialogue
	public void addPlumbing() {
		System.out.println("Plumbing: Letting water run through the house");
	}
	//prints unique dialogue
	
}

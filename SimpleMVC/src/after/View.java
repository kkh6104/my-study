package after;

public class View {

	private Controller controller;
	
	public View() {
		this.controller = new Controller();
	}
	
	public void display() {
		
		System.out.println(controller.getInfo());
		
	}
	
			
}

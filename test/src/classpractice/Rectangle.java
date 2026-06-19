package classpractice;

public class Rectangle {

	double horizontal;
	double vertical;
	
	public Rectangle(double horizontal, double vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}	
	
	public double getArea() {
		return this.horizontal * this.vertical;
	}
	
	public double getCircumference() {
		return (this.horizontal + this.vertical) * 2; 
	}
	
}

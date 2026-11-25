package geometry;

public class Donut extends Circle {

	private int innerRadius;

	
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		
		super(center, radius);
		this.selected = selected;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		
		
	}
	
	

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	
}

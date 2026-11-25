package geometry;

public class Circle extends Shape{

	protected Point center;
	protected int radius;

	public double area(){
		return radius*radius*Math.PI;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;	
	}
	
	@Override
	public void moveTo(int x, int y) {
		center.moveTo(x, y);
		
	}
	
	@Override
	public void moveBy(int x, int y) {
		center.moveBy(byX, byY);
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}


	
	
}

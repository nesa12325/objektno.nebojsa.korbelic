package geometry;

public class Rectangle extends Shape{
	private Point upperLeft;
	private int width;
	private int height;
	
	
	public double area() {
		return height*width;
		
	}
	public double circumference() {
		return 2*height+2*width;
		
	}
	
	@Override
	public void moveTo(int x, int y) {
		upperLeft.moveTo(x, y);
		
	}
	
	@Override
	public void moveBy(int x, int y) {
		upperLeft.moveBy(byX, byY);
		
	}
	
	
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	}


	
	
	
}

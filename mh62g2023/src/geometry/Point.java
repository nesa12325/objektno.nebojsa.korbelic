package geometry;

public class Point extends Shape{

	
	private int x;
	private int y;
	
	
	public double distance(Point p) {
		int dx = x - p.getX();
		int dy = y - p.getY();
		return Math.sqrt(dx*dx + dy*dy);
		
	}
	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	

	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		
		this.y = y;
	}
	

	
	public double distance(Point p) {
		int dx = x - p.getX();
		int dx = y - p.getY();
		System.out.println(dx);
		System.out.println(dy);
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public boolean contains(int x, int y) {
		return
		
	}
	
	
}

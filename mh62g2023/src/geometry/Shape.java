package geometry;

public abstract class Shape implements Movable, Comparable<Shape>{

	protected boolean selected;
	
	public Shape() {
		
	}
	
	public Shape(boolean selected) {
		this.selected = selected;
	}
	
	public abstract boolean contain(int x, int y);

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}

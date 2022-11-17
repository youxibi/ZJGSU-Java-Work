package work3;

public class Lft {
	private int length;
	private int width;
	private int height;
	
	public Lft(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
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
	public int getVolume() {
		return length*height*width;
	}
	@Override
	public String toString() {
		return "Lft [length=" + length + ", width=" + width + ", height=" + height + ", getVolume()=" + getVolume()
				+ "]";
	}
	
}

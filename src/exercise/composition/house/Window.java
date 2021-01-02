package exercise.composition.house;

public class Window {

	private int width;
	private int depth;
	private int height;
	private String material;

	public Window(int width, int depth, int height, String material) {
		this.width = width;
		this.depth = depth;
		this.height = height;
		this.material = material;
	}

	public void windowMaterial() {
		System.out.println("Window is made of " + getMaterial());
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}

	public int getHeight() {
		return height;
	}

	public String getMaterial() {
		return material;
	}

}

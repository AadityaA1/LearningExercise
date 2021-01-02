package exercise.composition.house;

public class Door {

	private boolean viewFinder;
	private String frameWood;
	private String doorWood;
	private Window window;

	public Door(boolean viewFinder, String frameWood, String doorWood, Window window) {
		this.viewFinder = viewFinder;
		this.frameWood = frameWood;
		this.doorWood = doorWood;
		this.window = window;
	}

	public void verifyDoorLocked() {
		System.out.println("Verifying door is locked");
	}

	public boolean isViewFinder() {
		return viewFinder;
	}

	public String getFrameWood() {
		return frameWood;
	}

	public String getDoorWood() {
		return doorWood;
	}

	public Window getWindow() {
		return window;
	}

}

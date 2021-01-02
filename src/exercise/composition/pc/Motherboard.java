package exercise.composition.pc;

public class Motherboard {

	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;

	public Motherboard(String manufacturer, int ramSlots, int cardSlots, String bios) {
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}

	public void loadProgram(String programName) {
		System.out.println("Program Name " + programName + " is loading");
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardSlots() {
		return cardSlots;
	}

	public String getBios() {
		return bios;
	}

}

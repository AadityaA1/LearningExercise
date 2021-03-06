package exercise.interfaces.saveobjects;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

	private String name;
	private int hitPoints;
	private int strength;
	private String weapon;

	public Player(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.weapon = "Sword";

	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player{name=" + name + ", hitPoints=" + hitPoints + ", strength=" + strength + ", weapon=" + weapon
				+ "}";
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add(0, this.name);
		values.add(1, "" + this.hitPoints);
		values.add(2, "" + this.strength);
		values.add(3, "" + this.weapon);

		return values;
	}

	@Override
	public void read(List<String> values) {
		// TODO Auto-generated method stub
		if (values != null && !values.isEmpty()) {
			this.name = values.get(0);
			this.hitPoints = Integer.parseInt(values.get(1));
			this.strength = Integer.parseInt(values.get(2));
			this.weapon = values.get(3);

		}
	}

}

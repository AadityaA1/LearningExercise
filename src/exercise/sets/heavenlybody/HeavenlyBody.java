package exercise.sets.heavenlybody;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

	private final String name;
	private final double orbintalPeriod;
	private final Set<HeavenlyBody> satellites;

	public HeavenlyBody(String name, double orbintalPeriod) {
		this.name = name;
		this.orbintalPeriod = orbintalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbintalPeriod() {
		return orbintalPeriod;
	}

	public boolean addMoon(HeavenlyBody moon) {
		return satellites.add(moon);
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		System.out.println("obj.getClass..." + obj.getClass());
		System.out.println("this.getClass..." + this.getClass());
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		return this.name.equals(((HeavenlyBody) obj).getName());

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}

}

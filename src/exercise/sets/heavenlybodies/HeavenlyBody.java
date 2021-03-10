package exercise.sets.heavenlybodies;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {

	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;
	private final Key key;

	public enum BodyTypes {
		STAR, PLANET, DWARF_PLANET, MOON, COMET, ASTEROID
	}

	public HeavenlyBody(String name, double orbitalPeriod, BodyTypes bodyType) {
		this.key = new Key(name, bodyType);
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public boolean addSatellite(HeavenlyBody moon) {
		return satellites.add(moon);
	}

	public Set<HeavenlyBody> getSatellites() {
		return satellites;
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj instanceof HeavenlyBody) {
			HeavenlyBody theObject = (HeavenlyBody) obj;
			return this.key.equals(theObject.getKey());
		}
		return false;

	}

	public Key getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.key.hashCode();
	}

	@Override
	public String toString() {
		return this.key.getName() + ": " + key.getBodyType() + ", " + this.orbitalPeriod;
	}

	public static final class Key {
		private final String name;
		private final BodyTypes bodyType;

		private Key(String name, BodyTypes bodyType) {
			this.name = name;
			this.bodyType = bodyType;
		}

		public String getName() {
			return name;
		}

		public BodyTypes getBodyType() {
			return bodyType;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.name.hashCode() + this.bodyType.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this.name.equals(((Key) obj).getName()))
				return this.bodyType == ((Key) obj).getBodyType();
			return false;
		}

		@Override
		public String toString() {
			return name + ": " + bodyType;
		}

	}

	public static Key makeKey(String name, BodyTypes bodyType) {
		// TODO Auto-generated method stub
		return new Key(name, bodyType);
	}

}

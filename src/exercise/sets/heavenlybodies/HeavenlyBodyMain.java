package exercise.sets.heavenlybodies;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HeavenlyBodyMain {

	private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp = new Planet("Mercury", 88);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Venus", 225);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Earth", 365);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new Moon("Moon", 27);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		temp = new Planet("Mars", 687);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		tempMoon = new Moon("Deimos", 1.3);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Phobos", 2.3);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		temp = new Planet("Jupiter", 4332);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		tempMoon = new Moon("Io", 1.8);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Europa", 3.5);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Ganymede", 7.1);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		tempMoon = new Moon("Calisto", 16.7);
		solarSystem.put(tempMoon.getKey(), tempMoon);
		temp.addSatellite(tempMoon);

		temp = new Planet("Saturn", 10759);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Uranus", 30660);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Neptune", 165);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		temp = new Planet("Pluto", 248);
		solarSystem.put(temp.getKey(), temp);
		planets.add(temp);

		System.out.println("Planets");

		for (HeavenlyBody planet : planets) {
			System.out.println("\t" + planet.getKey());
		}

		HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
		System.out.println("Moons of " + body.getKey());
		for (HeavenlyBody jupiterMoons : body.getSatellites()) {
			System.out.println("\t" + jupiterMoons.getKey());
		}

		body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
		System.out.println("Moons of " + body.getKey());
		for (HeavenlyBody jupiterMoons : body.getSatellites()) {
			System.out.println("\t" + jupiterMoons.getKey());
		}

		Set<HeavenlyBody> moons = new HashSet<>();
		for (HeavenlyBody planet : planets) {
			moons.addAll(planet.getSatellites());
		}

		System.out.println("All moons");
		for (HeavenlyBody moon : moons) {
			System.out.println("\t" + moon.getKey());
		}

		HeavenlyBody pluto = new DwarfPlanet("Pluto", 244);
		planets.add(pluto);

		for (HeavenlyBody planet : planets) {
			System.out.println(planet);
		}

		solarSystem.put(pluto.getKey(), pluto);
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
		System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

		System.out.println("\n\nThe solar system contains....");

		for (HeavenlyBody heavenlyBody : solarSystem.values()) {
			System.out.println(heavenlyBody);
		}
	}
}

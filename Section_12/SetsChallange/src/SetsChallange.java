import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetsChallange {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 80);
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

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        System.out.println("Planets:");
        for(HeavenlyBody planet: planets) {
            System.out.println(planet.getKey());
        }

        System.out.println();
        HeavenlyBody body = solarSystem.get(HeavenlyBody.makeKey("Mars", HeavenlyBody.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey() + ":");
        for(HeavenlyBody satellite: body.getSatellites()) {
            System.out.println(satellite.getKey());
        }
        System.out.println();
        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println();
        System.out.println("All moons:");
        for(HeavenlyBody moon: moons) {
            System.out.println(moon.getKey());
        }

        HeavenlyBody dwarfPlanet = new DwarfPlanet("Pluto", 842);
        planets.add(dwarfPlanet);

        System.out.println();
        System.out.println("All planets details:");
        for(HeavenlyBody planet: planets) {
            System.out.println(planet);
        }

        HeavenlyBody earth1 = new Planet("Earth1", 465);
        HeavenlyBody earth2 = new Planet("Earth1", 465);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(dwarfPlanet));
        System.out.println(earth2.equals(dwarfPlanet));

        System.out.println();
        solarSystem.put(dwarfPlanet.getKey(), dwarfPlanet);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));

        System.out.println();
        System.out.println();
        System.out.println("All bodies of solar system:");
        for(HeavenlyBody bodyOfSolarSystem: solarSystem.values()) {
            System.out.println(bodyOfSolarSystem);
        }
    }
}

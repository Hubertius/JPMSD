package pl.hubertius.example;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<>();
        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location) {
        this.exits.put(direction, location);
    }

    public int getLocationID() {
        return this.locationID;
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer> (this.exits);
    }
}

package pl.hubertius.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "You're sitting in front of computer learning Java"));
        locations.put(1, new Location(1, "You're standing at the end of the road near the bridge"));
        locations.put(2, new Location(2, "You're at the top of the hill"));
        locations.put(3, new Location(3, "You're inside a building, a well house for a spring"));
        locations.put(4, new Location(4, "You're in a valley beside a stream"));
        locations.put(5, new Location(5, "You're in the forest"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);


        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);


        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);


        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        Map<String, String> keyValuesLocations = new HashMap<>();
        keyValuesLocations.put("QUIT", "Q");
        keyValuesLocations.put("WEST", "W");
        keyValuesLocations.put("EAST", "E");
        keyValuesLocations.put("NORTH", "N");
        keyValuesLocations.put("SOUTH", "S");

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are: ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + " ");
            }
            System.out.println();
            System.out.println("Write where you want to go: ");
            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1) {
                String[] inputWords = direction.split(" ");
                for (String inputWord : inputWords) {
                    if (keyValuesLocations.containsKey(inputWord)) {
                        direction = keyValuesLocations.get(inputWord);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction!");
            }
        }
    }

}

/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class Action {
    private  Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public Action() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }


    public void command() {
        // write code here
        Scanner scanner = new Scanner(System.in);
        Location actualLocation = this.locations.get(1);

        while(true) {
            System.out.println(actualLocation.getDescription());
            System.out.println("Available exits are Q, S, E, N, W,");
            String input = scanner.nextLine();
            String[] words = input.toLowerCase().split(" ");
            Map<String, Integer> exits = actualLocation.getExits();
            boolean isNext = false;
            if(Arrays.asList(words).contains("west") || input.equals("W")) {
                for(String key: exits.keySet()) {
                    if(key.equals("W")) {
                        actualLocation = this.locations.get(exits.get(key));
                        isNext = true;
                    }
                }
            } else if(Arrays.asList(words).contains("east") || input.equals("E")) {
                for(String key: exits.keySet()) {
                    if(key.equals("E")) {
                        actualLocation = this.locations.get(exits.get(key));
                        isNext = true;
                    }
                }
            } else if(Arrays.asList(words).contains("north") || input.equals("N")) {
                for(String key: exits.keySet()) {
                    if(key.equals("N")) {
                        actualLocation = this.locations.get(exits.get(key));
                        isNext = true;
                    }
                }
            } else if(Arrays.asList(words).contains("south") || input.equals("S")) {
                for(String key: exits.keySet()) {
                    if(key.equals("S")) {
                        actualLocation = this.locations.get(exits.get(key));
                        isNext = true;
                    }
                }
            } else if(Arrays.asList(words).contains("quit") || input.equals("Q")) {
                System.out.println(this.locations.get(0).getDescription());
                break;
            } else {
                System.out.println("You cannot go into that direction!");
                continue;

            }
            if(!isNext) {
                System.out.println("You cannot go into that direction!");
            }
        }
        System.out.println("THE END");


    }
}

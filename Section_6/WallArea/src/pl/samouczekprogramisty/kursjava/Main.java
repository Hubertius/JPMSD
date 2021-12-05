package pl.samouczekprogramisty.kursjava;
import pl.samouczekprogramisty.kursjava.WallArea;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WallArea leftArea = new WallArea(20.0,30.0);
        System.out.println(leftArea);
        WallArea rightArea = new WallArea(-5.0,30.0);
        System.out.println(rightArea);
    }


}

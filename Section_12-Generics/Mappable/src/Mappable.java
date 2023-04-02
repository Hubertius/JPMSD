import java.util.Arrays;

public interface Mappable {

    void render();

    static double[] stringToLatLon(String location) {
        var splits = location.split(",");
        double lat = Double.parseDouble(splits[0]);
        double lng = Double.parseDouble(splits[1]);
        return new double[]{lat, lng};
    }
}

abstract class Point implements Mappable {
    private double[] location = new double[2];

    public Point(String location) {
        this.location = Mappable.stringToLatLon(location);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Point (" + location() + ")");
    }

    private String location() {
        return Arrays.toString(location);
    }
}

abstract class Line implements Mappable {
    private double locations[][];

    public Line(String... locations) {
        this.locations = new double[locations.length][];
        int index = 0;
        for(var location: locations) {
            this.locations[index++] = Mappable.stringToLatLon(location);
        }
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as Line (" + locations() + ")");
    }

    private String locations() {
        return Arrays.deepToString(locations);
    }
}

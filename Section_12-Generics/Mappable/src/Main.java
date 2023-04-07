public class Main {
    public static void main(String[] args) {
        var nationalParks = new Park[] {
            new Park("Yellowstone", "44.4882, -110.5916"),
            new Park("Grand Canyon", "36.1075, -112.0965")
        };
        Layer<Park> parkLayer = new Layer<>(nationalParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[] {
            new River("Missisipi", "47.1260, -95.2348", "29.1566, -89.2495"),
                new River("Missouri", "45.9239, -111.4983", "38.8146, -90.1218")
        };
        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.renderLayer();

    }
}
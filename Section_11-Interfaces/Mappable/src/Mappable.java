interface Mappable {
    String JSON_PROPERTY = """
                           "properties": {%s}\s""";
    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {
        return """
               "type": "%s", "label": "%s", "marker": "%s"\s""".formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable map) {
        System.out.println(JSON_PROPERTY.formatted(map.toJSON()));
    }
}

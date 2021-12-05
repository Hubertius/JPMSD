package pl.samouczekprogramisty.kursjava;

public class WallArea {

    private double width;
    private double height;

    public WallArea(double width, double height) {
        if(width < 0.0) {
            width = 0.0;
        }
        if(height < 0.0) {
            height = 0.0;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0.0) {
            width = 0.0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0) {
            height = 0.0;
        }
        this.height = height;
    }

    @Override
    public String toString() {
        return "Width: " + this.getWidth() + "\n" + "Height: " + this.getHeight();
    }
}

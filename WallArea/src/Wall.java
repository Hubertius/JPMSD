public class Wall {
    // write your code here
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double widthParam, double heightParam) {
        if(widthParam <= 0.0 && heightParam <= 0.0) {
            this.width = 0.0;
            this.height = 0.0;
            return;
        } else if(widthParam < 0.0) {
            this.width = 0.0;
            this.height = heightParam;
            return;
        } else if(heightParam < 0.0) {
            this.width = widthParam;
            this.height = 0.0;
            return;
        }
        this.width = widthParam;
        this.height = heightParam;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double value) {
        if(value < 0) {
            this.width = 0;
            return;
        }
        this.width = value;
    }

    public void setHeight(double value) {
        if(value < 0) {
            this.height = 0;
            return;
        }
        this.height = value;
    }

    public double getArea() {
        return this.width * this.height;
    }


}


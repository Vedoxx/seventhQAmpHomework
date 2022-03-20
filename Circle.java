public class Circle extends  Shape{
    private double radiusCircle;

    Circle(double radiusCircle){
        this.radiusCircle=radiusCircle;
    }

    @Override
    protected double perimeterShape() {
        if((2* this.radiusCircle*Math.PI)<0) throw new IllegalArgumentException("Input is not valid");
        return 2* this.radiusCircle*Math.PI;
    }

    @Override
    protected double areaShape() {
        if((this.radiusCircle* this.radiusCircle*Math.PI)<0) throw new IllegalArgumentException("Input is not valid");
        return this.radiusCircle* this.radiusCircle*Math.PI;
    }
}

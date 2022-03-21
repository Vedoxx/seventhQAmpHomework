public class Rectangular extends Shape{
 private double rectangleLength;
 private double rectangleWidth;

 Rectangular(double rectangleLength, double rectangleWidth){
     this.rectangleLength=rectangleLength;
     this.rectangleWidth=rectangleWidth;
 }

    @Override
    protected double perimeterShape() {
        if ((2*(this.rectangleLength*this.rectangleWidth))<0)  throw new IllegalArgumentException("Input is not valid.");
        return 2*(this.rectangleLength*this.rectangleWidth);
    }

    @Override
    protected double areaShape() {
        if((this.rectangleLength* this.rectangleWidth)<0) throw new IllegalArgumentException("Input is not valid");
        return this.rectangleLength* this.rectangleWidth;
    }
}

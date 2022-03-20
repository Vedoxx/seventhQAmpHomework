public class Triangle extends Shape{
    private double edgeOne;
    private double edgeTwo;
    private double edgeThree;

    Triangle(double edgeOne,double edgeTwo, double edgeThree){
        this.edgeOne=edgeOne;
        this.edgeTwo=edgeTwo;
        this.edgeThree=edgeThree;
    }

    @Override
    protected double perimeterShape() {
        if((this.edgeOne+this.edgeTwo+this.edgeThree)<0) throw new IllegalArgumentException("Input is not valid");
        return this.edgeOne+this.edgeTwo+this.edgeThree;
    }

    @Override
    protected double areaShape() {
        double semiPerimeter=(this.edgeOne+this.edgeTwo+this.edgeTwo)/2;
        if(semiPerimeter<0) throw new IllegalArgumentException("Input is not valid");
        return Math.sqrt(semiPerimeter*(semiPerimeter- this.edgeOne)*(semiPerimeter- this.edgeTwo)*(semiPerimeter- this.edgeThree));
    }
}

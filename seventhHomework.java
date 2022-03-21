import java.util.ArrayList;
import java.util.Scanner;


public class seventhHomework {
    static Scanner object=new Scanner(System.in);
    public static void main (String[] args) {
        ArrayList<Shape> shape=new ArrayList<>();
        char answer;
            int userAnswer=userMenu();
            if (userAnswer==1){
                int subAnswer=subMenu();
                System.out.println("Enter circle radius:");
                for (int i=0;i<subAnswer;i++){
                    System.out.print(i+1+ " circle:");
                    double circleRadius=object.nextDouble();
                    System.out.println("------------------------------------------------");
                    shape.add(new Circle(circleRadius));
                }
                result(shape);
            }
            if (userAnswer==2){
                int subAnswer=subMenu();
                for (int i=0;i<subAnswer;i++) {
                    System.out.print("Enter the length of the rectangle:");
                    double rectangleLength = object.nextDouble();
                    System.out.print("Enter the width of the rectangle:");
                    double rectangleWidth = object.nextDouble();
                    System.out.println("----------------------------------------------");
                    shape.add(new Rectangular(rectangleLength,rectangleWidth));
                }
             result(shape);
            }
            if (userAnswer==3) {
                int subAnswer=subMenu();
                for(int i=0;i<subAnswer;i++) {
                    System.out.print("Enter edge A:");
                    double edgeA= object.nextDouble();
                    System.out.print("Enter edge B:");
                    double edgeB=object.nextDouble();
                    System.out.print("Enter edge C:");
                    double edgeC=object.nextDouble();
                    System.out.println("--------------------------------------");
                    shape.add(new Triangle(edgeA,edgeB,edgeC));
                }
                result(shape);
            }
    }

    public static int userMenu() {
        System.out.println("------------------------MENU-------------------------");
        System.out.println("1-Circle");
        System.out.println("2-Rectangle");
        System.out.println("3-Triangle");
        System.out.print("Which shape would you like to calculate:");
        int userAnswer = object.nextInt();
        if(userAnswer!=3 && userAnswer!=2 && userAnswer!=1) throw  new IllegalArgumentException("Input is not valid");
        return userAnswer;
    }
    public static int subMenu() {
        System.out.println("Enter number of times you would like to calculate the shape");
        System.out.print("Answer:");
        int userAnswer=object.nextInt();
        if(userAnswer<0) throw new IllegalArgumentException("Input is not valid");
        return userAnswer;
    }
    public static void result(ArrayList<Shape>shape){
        int i=1;
        for (Shape result:shape){
            try {
                System.out.println("Area of " + i + " shape is:" + result.areaShape());
                System.out.println("Perimeter of " + i + " shape is:" + result.perimeterShape());
                System.out.println("------------------------------------------------------------");
                i++;
            } catch (IllegalArgumentException error){
                System.out.println(error.getMessage());
            }
        }
    }
}

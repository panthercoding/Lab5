public class Geometry{
  public static void main(String[] args){
    /* start coding in here 
    feel free to create Points and Circles and tinker with them
    as well as replace the existing code
    */

    Circle c1 = new Circle(5,0,0);
    Point p1 = new Point(4,4);

    if (c1.isInsideCircle(p1)){
      System.out.println("The Point is Inside the Circle");
    }
    else{
      System.out.println("The Point is Outside the Circle");
    }

  }
}


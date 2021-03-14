public class Circle{
  
  private double radius;
  private Point center;

  public Circle(double rad, double xCenter, double yCenter){
    radius = rad;
    center = new Point(xCenter, yCenter);
  }

  /* @param: a Point data object 
  @return: true if the Point is within the circle and false otherwise */
  public boolean isInsideCircle(Point P){
    /* to be implemented 
    hint: use the distanceTo method in the Point class */
  }

  public double calcArea(){
    return(Math.PI * radius * radius);
  }

  public Point getCenter(){
    return(center);
  }

  public double getRadius(){
    return(radius);
  }

}

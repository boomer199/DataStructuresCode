
public class Circle extends GeometricObject{
    private double radius;
   public Circle(){}
   public Circle(double radius){
       this.radius = radius;
   }
   public Circle(double radius, String color, boolean filled){
       this.radius = radius;
       setColor(color);
       setFilled(filled);
       
   }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter(){
        return 2 * this.radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
    
}   
import java.util.Date;

abstract class GeometricObject{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    public GeometricObject(){
        this.dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled){
         this.dateCreated = new java.util.Date();
         this.color = color;
         this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public boolean isFilled() {
        return filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        return this.color + " " + this.filled + " " + this.dateCreated;
    }
    abstract double getArea();
    abstract double getPerimeter();
    
}

public class TestGeometricObject {
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize two geometric objects ,new Circle(5) , new Rectangle(5,3)
    /*
    
        Write the code here for same
    */
    GeometricObject geoObject1 = new Circle(5);
    GeometricObject geoObject2 = new Rectangle(5,3);


    System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

    // Display circle
    displayGeometricObject(geoObject1);

    // Display rectangle
    displayGeometricObject(geoObject2);
  }

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(GeometricObject object1,GeometricObject object2) {
    //Write the code here 
    if(object1.getArea() == object2.getArea()){
        return true;
    }
    else return false;
  }

  /** A method for displaying a geometric object */
  public static void displayGeometricObject(GeometricObject object) {
      System.out.println();
      System.out.println("The area is "+ object.getArea());
      System.out.println("The perimeter is "+ object.getPerimeter());
      
  }
}

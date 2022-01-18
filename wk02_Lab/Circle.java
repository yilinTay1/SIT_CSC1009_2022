package wk02_Lab;
public class Circle {   
    double radius; 
    static final double PI =3.14159;  

    Circle() {   
        radius = 1;   
    }   
       
    Circle(double newRadius) {   
        radius = newRadius;   
    }   
       
    double getArea() {   
        return radius * radius * Math.PI;   
    }   
       
    double getPerimeter() {   
        return 2 * radius * Math.PI;   
    }   
       
    void setRadius(double newRadius) {   
        radius = newRadius;   
    }
    
    
    public static void main(String [] args){
      Circle c = new Circle(1);
      System.out.println(c.getArea());
      System.out.println(c.getPerimeter());
      c.setRadius(2);
      System.out.println(c.getArea());
      System.out.println(c.getPerimeter());
      c.setRadius(3);
      System.out.println(c.getArea());
      System.out.println(c.getPerimeter());
    }
}  

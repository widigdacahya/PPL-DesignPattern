// Step 2, create concrete class

public class Rectangle extends Shape{

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        // TODO Auto-generated method stub
        System.out.println("Inside Rectangle::draw() method.");
    }
    
}

package HW6.work1;

// Прямоугольник
public class Rectangle {

    protected int height;
    protected int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    public void print()
    {
        System.out.println("Rectangle with height - " + height + " and width - " + width);
    }


//    public String toString()
//    {
//        return String.format("Rectangle of height - %s and width - %s", height, width);
//    }
}

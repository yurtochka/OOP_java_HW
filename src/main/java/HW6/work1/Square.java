package HW6.work1;

// Квадрат
public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public void print() {
        System.out.println("Sides of the square - " + height);
    }
}


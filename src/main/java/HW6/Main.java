package HW6;

import HW6.work1.Rectangle;
import HW6.work1.Square;
import HW6.work3.GreeterInt;
import HW6.work3.HelloGreeting;
import HW6.work3.ViewGreeter;

public class Main {
    public static void main(String[] args) {

//work1
        Square side_sq = new Square(2);
        side_sq.print();

        Rectangle side_rect = new Rectangle(2, 3);
        side_rect.print();
//----------------------------------------------------------------------
        System.out.println("-------------------------------");
//----------------------------------------------------------------------
// work3
        GreeterInt greeter = new HelloGreeting();
        System.out.println(greeter.greeting());

        GreeterInt viewGreeter = new ViewGreeter(greeter);
        System.out.println(viewGreeter.greeting());
    }
}

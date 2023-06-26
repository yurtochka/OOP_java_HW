package HW6.work3;

public class ViewGreeter extends Greeter {

    public ViewGreeter(GreeterInt greeter) {
        super(greeter);
    }

    public String greeting() {
        return "My friend, " + super.greeting();
    }


}

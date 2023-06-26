package HW6.work3;

public abstract class Greeter implements GreeterInt {
    protected GreeterInt greeter;

    public Greeter(GreeterInt greeter) {
        this.greeter = greeter;
    }

    public String greeting() {
        return greeter.greeting();
    }

}

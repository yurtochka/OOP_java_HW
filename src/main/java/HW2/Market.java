package HW2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private final List<Actor> actors = new ArrayList<>();
    // TODO сделать список в конструкторе

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actor) {
        System.out.println(actor.getName() + " встал в очередь");

    }

    @Override
    public void releaseFromMarket(List<Actor> actor) {

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
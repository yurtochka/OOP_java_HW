package HW2;



public interface QueueBehaviour {

    void takeInQueue(Actor actor);  // очередь
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}
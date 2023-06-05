package HW2;


import java.util.List;


public interface MarketBehaviour {

    void acceptToMarket(Actor actor);  // доступ к маркет-плейсу
    void releaseFromMarket(List<Actor> actors);
    void update();

}
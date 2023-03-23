package hw1;
// снайпер
public class Sniper extends Character implements Shooter{
    
    public Sniper(String name, int life, int loss, int speed, String action) {
        super(name, life, loss, speed, action);
    }

    @Override
    public int hitProbability() {
        return 95;
    }
}

package hw1;
// арбалетчик
public class Arbalester extends Character implements Shooter{
    
    public Arbalester(String name, int life, int loss, int speed, String action) {
        super(name, life, loss, speed, action);
    }

    @Override
    public int hitProbability() {
        return 70;
    }
}

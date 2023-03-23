package hw1;

public abstract class Character {
    
    private String name;
    private int life;
    private int loss;
    private int speed;
    private String action;

    public Character(String name, int life, int loss, int speed, String action) {
        this.name = name;
        this.life = life;
        this.loss = loss;
        this.speed = speed;
        this.action = action;
    }
    
    @Override
    public String toString() {
        String text = String.format("name: %s, life: %d, loss: %d, speed: %d, action: %s", this.name, this.life, this.loss, this.speed, this.action);
        return text;
    }
}

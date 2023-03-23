package hw1;

public class Main {

    public static void main(String[] args) {
        Game charactersArray = new Game();
        charactersArray.addCharacter(new Arbalester("Арбалетчик", 5, 1, 4, "Стрельба"))
                        .addCharacter(new Peasant("Крестьянин", 7, 0, 4, "Защита"))
                        .addCharacter(new Monk("Монах", 7, 0, 4, "Защита"))
                        .addCharacter(new Pikeman("Копейщик", 7, 0, 4, "Удар"))
                        .addCharacter(new Sniper("Монах", 4, 1, 4, "Стрельба"))
                        .addCharacter(new Robber("Разбойник", 7, 0, 4, "Защита"))
                        .addCharacter(new Witch("Колдун", 7, 0, 4, "Защита"));
        
        for (Character character : charactersArray.getCharacters()) System.out.println(character);
                        
        System.out.println("_______________Shooter__________");                
        for (Shooter shooter : charactersArray.getHitProbability()) System.out.println(String.format("%s, Вероятность попадания в цель: %d", String.valueOf(shooter), shooter.hitProbability()));
    }

    
}

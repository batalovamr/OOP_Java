package hw1;

import java.util.List;
import java.util.ArrayList;

public class Game {
    
    private List<Character> characters;

    public Game() {
        this.characters = new ArrayList<>();
    }

    public Game addCharacter (Character character) {
        this.characters.add(character);
        return this;
    }

    public List<Shooter> getHitProbability() {
        List<Shooter> result = new ArrayList<>();
        for (Character character : characters){
            if (character instanceof Shooter){
                result.add((Shooter) character);
            }
        }
        return result;
    }

    public  List<Character> getCharacters() {
        return characters;
    }
}

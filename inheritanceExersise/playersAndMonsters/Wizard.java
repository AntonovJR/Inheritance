package inheritanceExersise.playersAndMonsters;

public class Wizard extends Hero{
    public Wizard(String username, int level) {
        super(username, level);
    }
    public String toString() {
        return super.toString();
    }
}

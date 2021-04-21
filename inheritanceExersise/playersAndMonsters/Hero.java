package inheritanceExersise.playersAndMonsters;

public class Hero {
    private String username;
    private int level;

    public Hero(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }
    public String toString() {
        return String.format("Type: %s Username: %s Level: %d",
        this.getClass().getName(),
                this.getUsername(),
                this.getLevel());
    }
}

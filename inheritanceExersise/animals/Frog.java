package inheritanceExersise.animals;

public class Frog extends Animal{
    public Frog(String name, int age, Gender gender) {
        super(name, age, gender);
    }
    protected String produceSound() {
        return "Ribbit!";
    }
}

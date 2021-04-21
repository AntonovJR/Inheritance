package inheritanceExersise.animals;

public class Kitten extends Cat{
    public Kitten(String name, int age) {
        super(name, age, Gender.FEMALE);
    }
    protected String produceSound() {
        return "Meow";
    }
}

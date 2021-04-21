package inheritanceExersise.animals;

public class Cat extends Animal {
    public Cat(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    protected String produceSound() {
        return "Meow meow";
    }
}

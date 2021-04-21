package inheritanceExersise.animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age) {
        super(name, age, Gender.MALE);
    }
    protected String produceSound() {
        return "MEOW";
    }
}

package inheritanceExersise.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"Beast".equals(input)) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            try {
                if (age < 0) {
                    throw new IllegalArgumentException("Invalid input!");
                }
                if (!tokens[2].equals("Male") && !tokens[2].equals("Female")) {
                    throw new IllegalArgumentException("Invalid input!");
                }
            } catch (IllegalArgumentException e){
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }


            Gender gender = Gender.MALE;
            if(tokens[2].equals("Female")){
                gender = Gender.FEMALE;
            }
            switch (input) {
                case "Frog":
                    Frog frog = new Frog(name,age,gender);
                    System.out.println(frog.toString());
                    break;
                case "Dog":
                    Dog dog = new Dog(name,age,gender);
                    System.out.println(dog.toString());
                    break;
                case "Cat":
                    Cat cat = new Cat(name,age,gender);
                    System.out.println(cat.toString());
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(name,age);
                    System.out.println(kitten.toString());
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(name,age);
                    System.out.println(tomcat.toString());
                    break;
            }

            input = scanner.nextLine();
        }
    }
}

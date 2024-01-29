package homework;

import homework.model.Person;
import homework.service.InputOutput;

public class App {
    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        Person person = new Person("Elena", "Egorova", 25);
        Person person2 = new Person("Elena", "Petrova", 25);
        System.out.println("person1: " + person);
        System.out.println("person2: " + person2);
        inputOutput.writeJson(person);
        Person person1 = inputOutput.readJson();
        System.out.println("person3 from file person.json: " + person1);
        System.out.println("Comparing person1 and person3: " + person.equals(person1));
        System.out.println("comparing person1 and person2: " + person.equals(person2));
        System.out.println("Calculating the hashCode() person1: " + person.hashCode());
        System.out.println("Calculating the hashCode() person2: " + person2.hashCode());
        System.out.println("Calculating the hashCode() person3: " + person1.hashCode());
        System.out.println("hashCode() person1 and hashCode() person 3 are equal, then person1 is equal to person3");
        System.out.println("hashCode() person1 and hashCode() person 2 are not equal, then person1 is not equal to person2");
    }
}

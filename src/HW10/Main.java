package HW10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(
                new Person("Petro", 25, Gender.MALE),
                new Person("Olena", 19, Gender.FEMALE),
                new Person("Marek", 50, Gender.MALE),
                new Person("Rasine", 65, Gender.FEMALE),
                new Person("Cherina", 42, Gender.FEMALE),
                new Person("Bridgett", 18, Gender.FEMALE),
                new Person("Jaron", 42, Gender.MALE),
                new Person("Namir", 18, Gender.MALE),
                new Person("John", 10, Gender.MALE),
                new Person("Jane", 78, Gender.FEMALE),
                new Person("Alonzo", 12, Gender.MALE),
                new Person("Azael", 43, Gender.FEMALE),
                new Person("Thomas", 12, Gender.MALE),
                new Person("Brittney", 43, Gender.FEMALE))
                .filter(person -> person.getAge() >= 18 && person.getAge() < 60)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}

class Person {
    private final String name;
    private final int age;
    private final Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + '-' + gender;
    }
}

enum Gender {
    MALE, FEMALE
}



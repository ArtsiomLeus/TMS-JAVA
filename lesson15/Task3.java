package lesson15;

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {

        Person person1 = new Person("Артем", 25);
        Person person2 = new Person("Владислав", 21);
        Person person3 = new Person("Михаил", 30);

        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);

        for (Person set : hashSet) {
            System.out.println(set);
        }

        hashSet.remove(person2);
        hashSet.remove(person3);

        System.out.println(hashSet.contains(person1));
    }
}

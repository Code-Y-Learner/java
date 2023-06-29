import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    private static class PhoneNumber {
        public final String phoneNumber;

        public PhoneNumber(String rawPhoneNumber) {
            this.phoneNumber = rawPhoneNumber.replaceAll("[^0-9]", "");
        }

        @Override
        public String toString() {
            return "PhoneNumber : " + phoneNumber;
        }
        @Override
        public boolean equals(Object o) {
            if (!(o instanceof PhoneNumber)) return false;
            return phoneNumber.equals(((PhoneNumber) o).phoneNumber);
        }
    }

    private static class Person {
        public final String name;
        private final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }

        public boolean hasPhoneNumber(PhoneNumber number) {
            return numbers.contains(number);
        }

        @Override
        public String toString() {
            return "Person :" + name + " : " + numbers;
        }
    }

    private static class PhoneBook {
        private final List<Person> people;

        private PhoneBook() {
            people = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String phoneNumber = in.nextLine();
        System.out.println(new PhoneNumber(phoneNumber));
        Person person = new Person("ysj");
        person.addPhoneNumber(new PhoneNumber(phoneNumber));
        System.out.println(person);
        System.out.println(person.hasPhoneNumber(new PhoneNumber(phoneNumber)));
    }
}
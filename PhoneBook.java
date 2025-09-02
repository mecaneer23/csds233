public class PhoneBook {
    public class Person {
        private String name;
        private String phoneNumber;

        public Person(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return this.name;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    private LinkedList<Person> contacts;

    public Person search() {
        return null;
    }

    public boolean add(Person person) {
        return false;
    }

    public Person delete(Person person) {
        return null;
    }

    // modify
    // boolean merge(Person p1, Person p2)
    // etc
}
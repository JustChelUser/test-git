public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Person person1 = new Person("Tom");
        System.out.println(person1.getName());
        person1.setName("Jack");
        System.out.println(person1.getName());
    }
}

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Dog dog = new Dog();
        Animal dog1 = new Dog();
        dog.run(499);
        dog.swim(10);
        cat.run(200);
        cat1.run(300);
        cat2.run(23);
        cat3.run(34);
        cat.swim(10);
        dog1.run(200);
        dog1.swim(11);
    }
}

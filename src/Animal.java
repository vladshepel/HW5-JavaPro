abstract class Animal {

    private static int instanceCount;

    public Animal() {
        instanceCount++;
        System.out.println("Created animals: " + instanceCount);
    }

    abstract public void run(int maxDistance);

    abstract public void swim(int maxSwim);
}



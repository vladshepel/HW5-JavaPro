public class Cat extends Animal{

    private static int instanceCount;

    public Cat() {
        instanceCount++;
        System.out.println("Created cats: " + instanceCount);
    }



    @Override
    public void run(int maxDistance) {
        if (maxDistance <= 200) {
            System.out.println("Cat run " + maxDistance);
        } else {
            System.out.println("Cat can not running more 200 meters");
        }
    }

    @Override
    public void swim(int maxSwim) {
        System.out.println("Cat can not swimming");

    }
}

public class  Dog extends Animal {
    private static int instanceCount;

    public Dog() {
        instanceCount++;
        System.out.println("Created dogs: " + instanceCount);
    }



    @Override
    public void run(int maxDistance) {
        if (maxDistance <= 500) {
            System.out.println("Dog run " + maxDistance + " meters");
        } else {
            System.out.println("Dog can not running more 500 meters");
        }

    }

    @Override
    public void swim(int maxSwim) {
        if (maxSwim <= 10) {
            System.out.println("Dog swim " + maxSwim + " meters");
        } else {
            System.out.println("Dog can not swimming more 10 meters");
        }

    }
}

package collections;

public class NumberSimulation {
    public static void main(String[] args) {
        NumberStorage storage = new NumberStorage();

        storage.add(10);
        storage.add(20);
        storage.add(30);
        storage.add(40);

        System.out.println("Current numbers:");
        storage.printNumbers();

        int target = 22;
        System.out.println("Closest to " + target + ": " + storage.findClosest(target));

        storage.remove(20);
        System.out.println("After removing 20:");
        storage.printNumbers();

        target = 22;
        System.out.println("Closest to " + target + ": " + storage.findClosest(target));
    }
}

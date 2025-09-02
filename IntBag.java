public class IntBag {
    private int[] items; // internal representation of the bag
    private int numItems = 0; // number of items currently in the bag

    public int remove() {
        // remove and return an item from the bag
        return 0;
    }

    public boolean add(int item) {
        if (this.numItems >= this.items.length) {
            return false;
        }
        this.items[this.numItems] = item;
        this.numItems++;
        return true;
    }

    public int size() {
        return this.numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public IntBag(int capacity) {
        this.items = new int[capacity];
    }

    public static void main(String[] args) {
        IntBag bag = new IntBag(10);
        bag.add(5);
        bag.add(10);
        System.out.println("Bag size: " + bag.size());
        System.out.println("Is bag empty? " + bag.isEmpty());
    }
}
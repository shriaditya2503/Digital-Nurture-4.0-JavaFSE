public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order(101, "Alice", 320.50),
                new Order(102, "Bob", 150.75),
                new Order(103, "Charlie", 560.10),
                new Order(104, "Diana", 450.00),
                new Order(105, "Eve", 200.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Test Bubble Sort
        Order[] bubbleSorted = orders.clone();
        SortUtils.bubbleSort(bubbleSorted);
        System.out.println("\nBubble Sorted Orders (by totalPrice desc):");
        printOrders(bubbleSorted);

        // Test Quick Sort
        Order[] quickSorted = orders.clone();
        SortUtils.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nQuick Sorted Orders (by totalPrice desc):");
        printOrders(quickSorted);
    }

    private static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
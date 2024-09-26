import java.util.LinkedList;

//insert for linkedlist
public class TimeComplexityLinkedList_insert {
    public static void main(String[] args) {
        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with integers
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();

            // insert for the first element
            linkedList.addFirst(10);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for insert first element in LinkedList of size " + size + ": " + duration + " nanoseconds");


            // Measure time for search operation
            startTime = System.nanoTime();

            // insert for the mid element
            linkedList.add(20,200);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for insert index 20 element in LinkedList of size " + size + ": " + duration + " nanoseconds");


            // Measure time for search operation
            startTime = System.nanoTime();

            // insert for the last element
            linkedList.addLast(200);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for insert last element in LinkedList of size " + size + ": " + duration + " nanoseconds");


    }
    }
}

import java.util.LinkedList;

//delete for linkedlist
public class TimeComplexityLinkedList_delete {
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

            // delete for the first element
            linkedList.removeFirst();

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for delete first element in LinkedList of size " + size + ": " + duration + " nanoseconds");


            // Measure time for search operation
            startTime = System.nanoTime();

            // delete for the mid element
            linkedList.remove(20);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for delete index 20 element in LinkedList of size " + size + ": " + duration + " nanoseconds");


            // Measure time for search operation
            startTime = System.nanoTime();

            // delete for the mid element
            linkedList.removeLast();

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for delete last element in LinkedList of size " + size + ": " + duration + " nanoseconds");


    }
    }
}

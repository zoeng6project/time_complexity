import java.util.LinkedList;

//index search for linkedlist
public class TimeComplexityLinkedList_indexsearch {
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
            
            // Searching for the last element
//            linkedList.contains(size - 1);
            long result = linkedList.get(size-1);
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in LinkedList of size " + size + ": " + duration + " nanoseconds" + "result " + result);
        }
    }
}

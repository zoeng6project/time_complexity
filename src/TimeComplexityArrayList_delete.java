import java.util.ArrayList;

//arraylist delete head mid tale
public class TimeComplexityArrayList_delete {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time for delete operation
            long startTime = System.nanoTime();
            
            // delete for the first element
            int head = 0;

            arrayList.removeFirst();

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for delete head in ArrayList of size " + size + ": " + duration + " nanoseconds " );


            // Measure time for delete operation
            startTime = System.nanoTime();

            // Searching for the mid element
            int mid = 20;

            arrayList.remove(mid);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for delete mid in ArrayList of size " + size + ": " + duration + " nanoseconds " );


            // Measure time for delete operation
            startTime = System.nanoTime();

            // Searching for the tale element
            long tale = size-1;

            arrayList.removeLast();

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for delete tale in ArrayList of size " + size + ": " + duration + " nanoseconds " );

        }
    }
}

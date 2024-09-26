import java.util.ArrayList;

//arraylist insert head mid tale
public class TimeComplexityArrayList_insert {
    public static void main(String[] args) {
        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with integers
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }

            // Measure time for insert operation
            long startTime = System.nanoTime();
            
            // insert for the first element

            arrayList.add(0,20);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for insert head in ArrayList of size " + size + ": " + duration + " nanoseconds " );


            // Measure time for insert operation
            startTime = System.nanoTime();

            // insert  the mid element
            arrayList.add(20,200);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for insert mid in ArrayList of size " + size + ": " + duration + " nanoseconds " );


            // Measure time for delete operation
            startTime = System.nanoTime();

            // insert for the tale element
            arrayList.add(size-1,200);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for insert tale in ArrayList of size " + size + ": " + duration + " nanoseconds " );

        }
    }
}

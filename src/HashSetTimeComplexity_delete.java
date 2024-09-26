import java.util.HashSet;

//delete for hashset head , mid, tale
public class HashSetTimeComplexity_delete {
    public static void main(String[] args) {
        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with integers
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }

            // Measure time for search operation
            long startTime = System.nanoTime();

            // delete for the first element

            // Desired Index
            int head = 0;
            hashSet.remove(0);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for remove head in HashSet of size " + size + ": " + duration + " nanoseconds"  );


            // Measure time for search operation
            startTime = System.nanoTime();

            // delete for the mid element

            // Desired Index
            int mid = 60;
            hashSet.remove(mid);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for remove mid in HashSet of size " + size + ": " + duration + " nanoseconds"  );


            // Measure time for search operation
            startTime = System.nanoTime();

            // delete for the tale element

            // Desired Index
            int tale = size-1;
            hashSet.remove(tale);

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for remove tale in HashSet of size " + size + ": " + duration + " nanoseconds"  );
        }
    }
}

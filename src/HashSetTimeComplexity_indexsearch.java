import java.util.HashSet;

//index search for hashset
public class HashSetTimeComplexity_indexsearch {
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
            
            // Searching for the last element
//            hashSet.contains(size - 1);
            // Iterator declaration
            int currentIndex = 0;

            // Desired Index
            int desiredIndex = size-1;

            long result = 0;

            for (int num :hashSet) {
                // Implementing for loop
                if (currentIndex == desiredIndex)
                {
                    result = num;
                    break;
                }
                currentIndex++;
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in HashSet of size " + size + ": " + duration + " nanoseconds  result : " + result );
        }
    }
}

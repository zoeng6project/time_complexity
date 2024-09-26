
//for delete element array

public class ArrayTimeComplexity_delete {
    public static void main(String[] args) {
        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with integers
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            // Measure time for search operation
            long startTime = System.nanoTime();
            
            // delete for the first element

            int[] newArrayFirst = new int[size-1];

            for (int i=1 ; i<= size-1 ; i++){
                newArrayFirst[i-1] = array[i];
            }
            
            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for delete first element in array of size " + size + ": " + duration + " nanoseconds");


            // Measure time for search operation
            startTime = System.nanoTime();

            // delete for the mid element

            int[] newArrayMid = new int[size-1];

            for (int i=0 ; i<= 20 ; i++){
                newArrayMid[i] = array[i];
            }

            for (int i=22 ; i<= size-1 ; i++){
                newArrayMid[i-1] = array[i];
            }

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for delete mid element in array of size " + size + ": " + duration + " nanoseconds");


            // Measure time for search operation
            startTime = System.nanoTime();

            // delete for the mid element

            int[] newArrayLast = new int[size-1];

            for (int i=0 ; i<= size-2 ; i++){
                newArrayLast[i] = array[i];
            }

            endTime = System.nanoTime();
            duration = endTime - startTime;

            System.out.println("Time taken for delete last element in array of size " + size + ": " + duration + " nanoseconds");

        }
    }
}


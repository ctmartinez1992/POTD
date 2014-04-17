package potd;

import java.util.Arrays;

/**
 * Duplicate Numbers
 * Hopefully while filling out your taxes you didn't run in to any issues with duplicate numbers.
 * However, if you did now is your chance to make up for it.
 * For today's problem you'll be passed in an array of integers and asked to identify all the duplicate numbers.
 * For a bonus solve it in under O(n^2) without making use of a set/hash (unless you want to implement your own :)).
 * 
 *
 * @author Carlos
 */
public class Day31_DuplicateNumbers {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        findDuplicates(new int[] {1, 2, 3});
        findDuplicates(new int[] {1, 2, 3, 5, 3, 7, 4, 7, 6, 5, 6, 7, 6, 7, 6, 7, 1, 0, 99, 88, 77, 66, 66, 55, 44, 33});
    }
    
    private static void findDuplicates(int[] array) {
        int c = 0;
        Arrays.sort(array);
        for(int i = 1; i < array.length; i++)
            if(array[i] == array[i - 1]) {
                System.out.println("Found duplicate, it's: " + array[i]);
                c++;        //HAHAHAHAH get it!!, C++... HAHAHAHAHA...
            }
        if(c == 0) System.out.println("No duplictes were found!");
    }
}

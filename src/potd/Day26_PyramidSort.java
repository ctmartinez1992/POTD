package potd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Pyramid Sort
 * The pyramids of Egypt are some of the most fascinating structures in the world.
 * To honor the great pyramids we'll be introducing pyramid sort.
 * Pyramid sort works so that the highest numbers are in the center of the array and the lowest are on the edges.
 * When comparing 2 numbers the smaller number goes on the left.
 * So if the array contains 1,2,3 then 1 goes on the left with 2 on the far right and 3 in the middle.
 * Here are 2 more examples:
 * > psort([1,2,3,4,5])
 * [1,3,5,4,2]
 * > psort([1,3,5,7,9,11])
 * [1,5,9,11,7,3]
 * 
 *
 * @author Carlos
 */
public class Day26_PyramidSort {
    
    public static void main(String[] args) {
        testCase();
    }
    
    public static void testCase() {
        pyramidSort();
    }
    
    public static void pyramidSort() {
        List<Integer> list = new ArrayList();
        Collections.addAll(list, 1, 3, 5, 7, 9, 11, 2, 4, 20, 34);
        int[] a = new int[list.size()];
        
        for(int i: list) {
            a[list.indexOf(i)] = i;
        }
        
        pSort(a);
    }

    public static void pSort(int[] a) {
        int[] result = new int[a.length];
        int sI = 0;
        int eI = a.length - 1;
        boolean nextSide = true;
        while (!isEmpty(a)) {
            int smallest = Integer.MAX_VALUE;
            for (int j : a)
                if (j < smallest && j != 0) smallest = j;

            a[getIndex(a, smallest)] = 0;
            
            if (nextSide) result[sI++] = smallest;
            else          result[eI--] = smallest;
            nextSide = !nextSide;
        }
        
        System.out.println(Arrays.toString(result));
    }

    public static boolean isEmpty(int[] a) {
        for (int i : a)
            if (i != 0) return false;
        return true;
    }

    public static int getIndex(int[] a, int i) {
        int index = 0;
        for (int x : a) {
            if (x == i) return index;
            else        index++;
        }
        
        return -1;
    }
}

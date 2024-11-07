package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));

        // In-place reversal of array
        for(int i = 0; i < array.length / 2; i++) {
            // Swapping the elements
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }
        System.out.println("Reversed Array :" + Arrays.toString(array));
	}
}

package permutation;

import java.util.Arrays;

/**
 * 
 * @author asiantech start: [0,1,2...n-1,n] end: [n,n-1,...2,1,0] Hoán vị kết
 *         tiếp sẽ luôn lơn hơn hoán vị trước đó
 */
public class Permutation {
	public void swap(int[] array, int index1, int index2) {
		int temp;
		temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public void showPermutations(int n) {
		int[] array = createArrays(n);
		printArray(array);
		int index = n - 1;
		while (index > 0) {
			index = n - 1;
			// Kiểm tra sự tăng dần của dãy hoán vị
			while (index > 0 && array[index - 1] > array[index]) {
				index--;
			}
			if (index == 0) {
				return;
			}
			// Đảo phần từ để tăng dần
			for (int k = n - 1; k >= index; k--) {
				if (array[k] > array[index - 1]) {
					swap(array, k, index - 1);
					break;
				}
			}
			// Đảo ngược đoạn sau để tăng dần
			for (int i = index; i < index + (n - index) / 2; i++) {
				swap(array, i, n - 1 - i + index);
			}
			printArray(array);
		}
	}

	private int[] createArrays(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
		return array;
	}

	void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {
		Permutation permutation = new Permutation();
		permutation.showPermutations(5);
	}
}

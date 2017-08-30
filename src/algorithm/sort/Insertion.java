package algorithm.sort;

import java.util.Arrays;

/**
 * 
 * @author asiantech 
 * Xét danh sách con gồm k phần tử đầu a1 … ak. Với k = 1,
 *         danh sách gồm một phần tử đã được sắp xếp thành dãy tăng dần. Giả sử
 *         trong danh sách k-1 phần tử đầu a1 … ak-1 đã được sắp xếp. Để sắp xếp
 *         phần tử ak = x ta tìm vị trí thích hợp của nó trong dãy a1 … ak-1. Vị
 *         trí thích hợp cần tìm là vị trí đứng trước phần tử lớn hơn nó và sau
 *         phần tử nhỏ hơn hoặc bằng nó Phù hợp với danh sách nhỏ, có một phần
 *         dánh sách đã được sắp xếp
 */
public class Insertion {
	private int[] mList = new int[] { 3, 2, 4, 5, 1 };

	public void sort() {
		for (int i = 1; i < mList.length; i++) {
			int x = mList[i];
			int j = i;
			while (j > 0 && mList[j - 1] > x) {
				mList[j] = mList[j - 1];
				j--;
			}
			mList[j] = x;
		}
	}

	public void swap(int[] arrays, int index1, int index2) {
		int temp = arrays[index1];
		arrays[index1] = arrays[index2];
		arrays[index2] = temp;
	}

	public void print() {
		System.out.println("Input: " + Arrays.toString(mList));
		sort();
		System.out.println("Output:" + Arrays.toString(mList));
	}

	public static void main(String[] args) {
		Insertion bubbule = new Insertion();
		bubbule.print();
	}
}

package algorithm.sort;

import java.util.Arrays;

/**
 * 
 * @author asiantech 
 * Thuật toán sủy bọt
 * Duyệt mảng rồi so sánh 2 phàn tử liền kề, để dưa phần tử lớn nhất về cuối cùng
 */
public class Bubbule {
	private int[] mList = new int[] { 3, 2, 4, 5, 1 };
	public void sort() {
		int steps = mList.length - 1;
		for (int i = 0; i < steps; i++) {
			for (int j = 0; j < steps - i; j++) {
				if (mList[j] > mList[j + 1]) {
					swap(mList, j, j + 1);
				}
			}
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
		Bubbule bubbule = new Bubbule();
		bubbule.print();
	}
}

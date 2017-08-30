package algorithm.sort;

import java.util.Arrays;

/**
 * 
 * @author asiantech Thuật toán lựa chọn Duyệt mảng và chọn phần từ nhỏ nhất cho
 *         vào đầu mảng
 */
public class Selection {
	private int[] mList = new int[] { 3, 2, 4, 5, 1 };

	public void sort() {
		int m = mList.length - 1;
		int min = mList[0];
		int index = 0;
		int minPostion = 0;
		while (m > 0) {
			for (int i = index; i < mList.length; i++) {
				if (mList[i] < min) {
					min = mList[i];
					minPostion = i;
				}
			}
			if (minPostion > index) {
				swap(mList, minPostion, index);
			}
			index++;
			min = mList[index];
			minPostion = 0;
			m--;
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
		Selection bubbule = new Selection();
		bubbule.print();
	}
}

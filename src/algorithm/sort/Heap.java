package algorithm.sort;

import java.util.Arrays;

/**
 * 
 * @author asiantech Thuật toán sắp xếp vun đắp 
 * 			Giai đoạn 1
 *         Từ dãy dữ liệu input, ta sẽ sắp xếp chúng thành một heap (dạng cấu
 *         trúc cây nhị phân). Heap này có thể là Min-heap (nút gốc có giá trị
 *         bé nhất) hoặc Max-heap (nút gốc có giá trị lớn nhất), trong bài viết
 *         này, ta sẽ sử dụng Max-heap với một số yêu cầu thỏa mãn sau:
 * 
 *         Nút cha sẽ luôn lớn hơn tất cả các nút con, nút gốc của heap sẽ là
 *         phần tử lớn nhất. Heap được tạo thành phải là một cây nhị phân đầy
 *         đủ, tức ngoại trừ các nút lá, ở cùng một cấp độ các nút nhánh không
 *         được thiếu. 
 *         Giai đoạn 2
 * 
 *         Giai đoạn này gồm các thao tác được lặp đi lặp lại cho đến khi mảng
 *         dữ liệu được toàn tất sắp xếp:
 * 
 *         Đưa phần tử lớn nhất của heap được tạo vào mảng kết quả, mảng này sẽ
 *         chứa các phần tử đã được sắp xếp. Sắp xếp lại heap sau khi loại bỏ
 *         nút gốc (có giá trị lớn nhất) để tìm phần tử có giá trị lớn nhất tiếp
 *         theo. Thực hiện lại thao tác 1 cho đến khi các phần tử của heap đều
 *         được đưa vào mảng kết quả. Như thế, mảng kết quả sẽ chứa các phần tử
 *         được sắp xếp giảm dần.
 */
public class Heap {
	private int[] mList = new int[] { 3, 2, 4, 5, 1 };

	public void sort() {

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
		Heap bubbule = new Heap();
		bubbule.print();
	}
}

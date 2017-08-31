package algorithm.sort;

import java.util.Arrays;

/**
 * 
 * @author asiantech Thuật toán sắp xếp vun đắp Giai đoạn 1 Từ dãy dữ liệu
 *         input, ta sẽ sắp xếp chúng thành một heap (dạng cấu trúc cây nhị
 *         phân). Heap này có thể là Min-heap (nút gốc có giá trị bé nhất) hoặc
 *         Max-heap (nút gốc có giá trị lớn nhất), trong bài viết này, ta sẽ sử
 *         dụng Max-heap với một số yêu cầu thỏa mãn sau:
 * 
 *         Nút cha sẽ luôn lớn hơn tất cả các nút con, nút gốc của heap sẽ là
 *         phần tử lớn nhất. Heap được tạo thành phải là một cây nhị phân đầy
 *         đủ, tức ngoại trừ các nút lá, ở cùng một cấp độ các nút nhánh không
 *         được thiếu. Giai đoạn 2
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
 * 
 *         Ưu điểm: Trong trường hợp xấu nhất, nhanh hơn quitsort, không dùng đệ
 *         quy nếu mảng đã được sắp xếp một phần, heap sort nhanh hơn quitsort
 * 
 */
public class Heap {
	private int[] mList = new int[] { 3, 2, 4, 5, 1, 10, -1, 7, 6 };

	/**
	 * Phẩn tử lớn nhất ở đỉnh heap cho vào cuối mảng đồng thời trừ đi một node và
	 * sắp xếp heap còn lại
	 */
	public void sort() {
		int heapSize = mList.length - 1;
		createHeap(mList, heapSize);
		for (int i = heapSize; i >= 0; i--) {
			swap(mList, 0, i);
			heapSize--;
			heapFy(mList, heapSize, 0);
		}
	}

	/**
	 * Kiem tra node con lon hon node cha thi doi cho
	 */
	private void heapFy(int[] arrays, int n, int parrentPosition) {
		while (parrentPosition <= n / 2 - 1) {
			int child1Position = 2 * parrentPosition + 1;
			int child2Position = 2 * parrentPosition + 2;
			int maxChildPostion = child1Position;
			if (child1Position < n && arrays[child2Position] > arrays[child1Position]) {
				maxChildPostion = child2Position;
			}
			if (arrays[parrentPosition] < arrays[maxChildPostion]) {
				swap(arrays, parrentPosition, maxChildPostion);
			}
			parrentPosition = maxChildPostion;
		}
	}

	/**
	 * – Tất cả các phần tử trên mảng có chỉ số [n/2] đến [n – 1] đều là node lá –
	 * Mỗi node lá được xem là Heap có duy nhất 1 phần tử – Thực hiện thao tác
	 * Heapify trên các phần tử có chỉ số từ [n/2 – 1] => 0 ta sẽ tạo được 1 Heap có
	 * n phần tử
	 */
	private void createHeap(int arrays[], int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapFy(arrays, n, i);
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
		Heap heap = new Heap();
		heap.print();
	}
}

package csu.sortMethods;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 22, 12, 45, 19, 26, 23, 68, 9, 19, 88 };

		quickSort(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int index = getIndex(arr, low, high);
			quickSort(arr, low, index - 1);
			quickSort(arr, index + 1, high);
		}

	}

	public static int getIndex(int[] arr, int i, int j) {

		int tmp = arr[i];
		while (i < j) {
			while (i < j && arr[j] >= tmp) {
				j--;
			}
			arr[i] = arr[j];

			while (i < j && arr[i] <= tmp) {
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = tmp;
		return i;

	}

}

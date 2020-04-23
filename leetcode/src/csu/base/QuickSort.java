package csu.base;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 4, 2, 5, 6, 3, 8, 7, 6 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	public static int getPartition(int[] arr, int i, int j) {

		int temp = arr[i];
		while (i < j) {
			while (arr[j] >= temp&&j>i) {
				j--;
			}
			arr[i] = arr[j];
			while (arr[i] <= temp&&i<j) {
				i++;
			}
			arr[j] = arr[i];
		}
		arr[i] = temp;
		return i;
	}

	public static void quickSort(int arr[], int low, int high) {

		if (low < high) {
			int partitionIndex = getPartition(arr, low, high);
			quickSort(arr, low, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, high);
		}

	}

}

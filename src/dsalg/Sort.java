package dsalg;
import java.util.Arrays;

public class Sort {
	public static int[] bublesort(int[] arr) {
		for(int i = arr.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j+1]) {
					int l = arr[j+1];
					int p = arr[j];
					arr[j] = l;
					arr[j+1] = p;
				}
			}
		}
		return arr;
	}
	
	public static int [] insertionsort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while (j > 0 && arr[j] < arr[j-1]) {
				int temp1 = arr[j-1];
				int temp2 = arr[j];
				arr[j] = temp1;
				arr[j-1] = temp2;
				j--;
			}
		}
		return arr;
	}
	
	public static int [] selectionsort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static int[] mergesort(int[] arr) {
		int middlePoint = arr.length / 2;
		if (arr.length == 1) {
			return arr;
		} else {
			int[] left = mergesort(Arrays.copyOfRange(arr, 0, middlePoint));
			int[] right = mergesort(Arrays.copyOfRange(arr, middlePoint, arr.length));
			return merge(left, right);
		}
	}
	
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int nextIndex = 0;
		int temp1 = 0;
		int temp2 = 0;
		while(temp1 < arr1.length || temp2 < arr2.length) {
			if (temp1 >= arr1.length) {
				merged[nextIndex] = arr2[temp2];
				temp2++;
			} else if (temp2 >= arr2.length) {
				merged[nextIndex] = arr1[temp1];
				temp1++;
			} else if (temp1 < arr1.length && temp2 < arr2.length && arr1[temp1] < arr2[temp2]) {
				merged[nextIndex] = arr1[temp1];
				temp1++;
			} else if(temp1 < arr1.length && temp2 < arr2.length && arr1[temp1] >= arr2[temp2]) {
				merged[nextIndex] = arr2[temp2];
				temp2++;
			}
			nextIndex++;
		}
		return merged;
	}
}

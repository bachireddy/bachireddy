package net.hyd.interview;

public class Sorting {

	public static void main(String[] args) {
		int list[] = { 7, 8, 5, 4, 3, 6, 8, 7, 9 };
		System.out.print("before sorting: ");
		for (int i : list) {
			System.out.print(" " + i);
		}

		int afterSort[] = sort(list);
		System.out.print("\nafter sorting : ");
		for (int i : afterSort) {
			System.out.print(" " + i);
		}

	}

	private static int[] sort(int[] list) {
		int temp = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length - 1; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}

}

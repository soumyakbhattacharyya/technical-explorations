package foundation.algorithm_part_1.union.find;

public class UF {

	private int[] elements;

	public UF(int num) {
		elements = new int[num];
		for (int i = 0; i < num; i++) {
			elements[i] = i;
		}
	}

	public int[] getElements() {
		return elements;
	}

	// given two elements find if they have same value in the array, which denotes
	// their connectedness
	public boolean isConnected(int p, int q) {
		return getElements()[p] == getElements()[q];
	}

	public void union(int p, int q) {

		int first = getElements()[p];
		int second = getElements()[q];

		int min = first > second ? second : first;
		int max = first < second ? first : second;

		for (int i = 0; i < elements.length; i++) {
			if (getElements()[i] == max) {
				getElements()[i] = min;
			}
		}

	}

}


public class ArraySum {
	public int sumOfArray(Integer[] a, int index) 
	{
		if (index == 0) // basecase
			return a[index];
		int sum = a[index] + sumOfArray(a, index - 1);
		return sum;
	}
}

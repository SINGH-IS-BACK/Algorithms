import java.util.*;

class sumK{

	void Pair_sumK(int[] array, int k) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < array.length ; i++) {
			if(hm.containsKey(array[i]))
				hm.put(array[i], (hm.get(array[i])) + 1);
			else
				hm.put(array[i],1);
		}

		for(int i=0; i<array.length ; i++) {
			if(hm.containsKey(k-array[i]) && hm.get(k-array[i]) !=0) {
				int num = hm.get(k-array[i]);
				hm.put(k-array[i], num -1);
				System.out.println(array[i] + " " + (k-array[i]));
			}
		}
	}
			


	public static void main(String args[]){
		int array[] = new int[10];
		for(int i =1; i <10; i++)
			array[i]=9;

		int k = 9;
		sumK sk = new sumK();
		sk.Pair_sumK(array, k);
	}


}


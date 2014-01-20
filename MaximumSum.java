import java.util.*;

class MaximumSum{

	void Max_sum(int[] array) {
		int start =0;
		int end = 0;
		int sum = 0;

		int temp_start =0;
		int temp_sum = 0;
		for(int i = 0 ; i < array.length ; i++) {
			temp_sum += array[i];
			if(temp_sum > sum){
				start = temp_start;
				end = i;
				sum = temp_sum;
			}
			else if(temp_sum < 0){
				temp_start = i+1;
				temp_sum = 0;
			}
		}
		System.out.println(start + " " + end + " " + sum);
	}
			




	public static void main(String args[]){
		int array[] = {0,1,2,-1,-2,3,4,-8,10,-1};
		MaximumSum ms = new MaximumSum();
		ms.Max_sum(array);
	}


}


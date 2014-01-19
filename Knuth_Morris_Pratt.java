import java.util.*;

class Knuth_Morris_Pratt{

	void Preprocessing(){
		String Pattern = "abaababaabaaa";
		int value[] = new int[Pattern.length()];

		int j = -1;
		value[0] = j;
		for(int i = 1; i<value.length ; i++){
			while(j>=0 &&  Pattern.charAt(i)!=Pattern.charAt(j)){
				j=value[j];
				//System.out.println(j);
			}
			j++;
			value[i]=j;
		}
		for(int i =0 ; i<value.length ; i++){
			System.out.println(value[i]);
		}

	}
	public static void main(String args[]){
		Knuth_Morris_Pratt kmp = new Knuth_Morris_Pratt();
		kmp.Preprocessing();
		//for(int i=0; i<value.length ; i++){
		//	System.out.println(value[i]);
		//}
	}
}


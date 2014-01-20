import java.util.*;

class Knuth_Morris_Pratt{

	int[] Preprocessing(String Pattern){
		int value[] = new int[Pattern.length()+1];

		int j = -1;
		value[0] = j;
		for(int i = 0; i<value.length-1 ; i+=0){
			while(j>=0 &&  Pattern.charAt(i)!=Pattern.charAt(j)){
				j=value[j] ;
				//System.out.println("kamal"+j + " " + i);
			}
			//System.out.println("kamal");
			//System.out.println("kamal");
			i++;
			j++;
			value[i]=j;
			//System.out.println(value[i]);
		}
		for(int i =0 ; i<value.length ; i++){
			System.out.println(value[i]);
		}
		return value;

	}

	boolean Search(String text, String pattern, int[] value){

		int j = 0;
		for(int i =0 ; i<text.length(); i++){
			while(j>0 && text.charAt(i)!=pattern.charAt(j)){
				j=value[j+1];
			}
			if(text.charAt(i)==pattern.charAt(j))
				j++;
			if(j==pattern.length())
				return true;
		}
		return false;
	}


	public static void main(String args[]){
		Knuth_Morris_Pratt kmp = new Knuth_Morris_Pratt();
		String text = "kamaldeep abaababaabaa singh thethi";
		String pattern = "them";
		String Pattern = "abaababaabaaaaa";
		int[] value = kmp.Preprocessing(Pattern);
		boolean found = kmp.Search(text, Pattern, value);
		System.out.println(found);
		//for(int i=0; i<value.length ; i++){
		//	System.out.println(value[i]);
		//}
	}
}


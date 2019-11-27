package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArray {
	public static void main(String[] args)
	{
		int[] ia = {23, 45, 50, 23, 56}; 
		int[] ib = new int[3]; 
		System.arraycopy(ia,1,ib,0,3); 
		for(int i : ib)
			System.out.print(i + " ");
		System.out.println();
		int[] ibCopy = ib;
		ibCopy[0]++;
		System.out.println(ibCopy[0]);
		System.out.println(ib[0]);
		
		int[] ibClone = (int[])ib.clone();
		ibClone[0]++;
		System.out.println(Arrays.toString(ibClone));
		System.out.println(Arrays.toString(ib));
		
		ArrayList<Integer> al = new ArrayList<Integer>(); 
		List <Integer> al1 = new ArrayList<>();	
		al.add(12);
		al.add(14);
		System.out.println(al);
		System.out.println(al.get(0)+1);
		int in = al.get(0)+1; //auto-boxing from Integer to int
		System.out.println(al.get(0).getClass());
		
		
	}

}

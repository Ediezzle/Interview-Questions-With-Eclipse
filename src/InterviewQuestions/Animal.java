package InterviewQuestions;

import java.util.Arrays;

public class Animal {

		// TODO Auto-generated constructor stub
		public	Animal(String name,	String type)
		{
			this.name	=	name;
			this.type	=	type;
		}
		
		

		@Override
		public String toString() {
			return String.format("Animal [name=%s, type=%s]", name, type);
		}



		String	name;
		String	type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal =	new	Animal("Tommy",	"Dog");
		System.out.println(animal);
		
		int	marks[] = {25, 30, 50, 10, 5};	
		System.out.println(marks);	//[I@6db3f829	
		System.out.println(	Arrays.toString(marks));//[25, 30, 50,	10,	5]
		for(int i=0; i<marks.length;i++)
			System.out.print(marks[i] + " ");
		System.out.println();
		
		for(int j : marks)
			System.out.print(j + " ");
		System.out.println();
		
  int[][] matrix3 = { { 1, 2, 3 }, { 4, 5, 6 } }; 
  System.out.println(matrix3); //[[I@1d5a0305 
  System.out.println(Arrays.toString(matrix3));  //[[I@6db3f829, [I@42698403] 
  System.out.println(Arrays.deepToString(matrix3));  //[[1, 2, 3], [4, 5, 6]]
  
  System.out.println(matrix3[0]);//[I@86c347	
  System.out.println(Arrays.toString(matrix3[0]));//[1,2,3]	
  
  int[] numbers1 = { 1, 2, 3 }; int[] numbers2 = { 4, 5, 6 }; 
  System.out.println(Arrays.equals(numbers1, numbers2)); //false 
  int[] numbers3 = { 1, 2, 3 }; System.out.println(Arrays.equals(numbers1, numbers3)); //true
  System.out.println("--------------------------------------------------------------------------");
	}
}
  



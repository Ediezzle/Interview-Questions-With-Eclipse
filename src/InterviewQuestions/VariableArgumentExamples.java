package InterviewQuestions;

public class VariableArgumentExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableArgumentExamples	example	=	new	VariableArgumentExamples();
		  //3	Arguments									
		  System.out.println(example.sum(1,	4,	5));//10									
		  //4	Arguments						
		  System.out.println(example.sum(1,	4,	5,	20));//30									
		  //0	Arguments									
		  System.out.println(example.sum());//0	
		  System.out.println(example.average(8, 6, 12));
			}
			
	public int sum(int...numbers)
	{
		//inside the method a variable argument is similar to an array.
		//number can be treated as if it is declared as int[]numbers;
		int sum = 0;
		for(int number: numbers)
		{
			sum+= number;
		}
		return sum;
	}
	
	public double average(int...nums)
	{
		int sum = 0;
		for(int i=0; i<nums.length; i++)
		{
			sum+= nums[i];
		}
		double average=(double)sum/nums.length;
		return average;
	}
}



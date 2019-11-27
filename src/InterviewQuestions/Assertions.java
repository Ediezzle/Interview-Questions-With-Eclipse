package InterviewQuestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Assertions {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assertions ass = new Assertions();
		System.out.println(ass.computeSimpleInterest(500, 0.2f, 4)); //???HOW???
		
		System.out.println(LocalDate.now().lengthOfMonth());
		System.out.println(LocalTime.now().toString());
		System.out.println(LocalDateTime.now().toString());
	}
	
	private int computeSimpleInterest(int principal, float interest, int years)
	{
		assert (principal>0);
		return 100;
	}

}
